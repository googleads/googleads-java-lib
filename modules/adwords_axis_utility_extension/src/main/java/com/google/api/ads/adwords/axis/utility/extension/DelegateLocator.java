// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension;

import com.google.api.ads.adwords.axis.utility.extension.delegates.AdGroupAdDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.AdGroupBidModifierDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.AdGroupCriterionDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.AdGroupDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.AdGroupFeedDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.AdParamDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.AlertDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.BudgetDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.BudgetOrderDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.CampaignAdExtensionDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.CampaignCriterionDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.CampaignDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.CampaignFeedDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.ConstantDataDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.ConversionTrackerDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.CustomerSyncDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.DataAdGroupBidLandscapeDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.DataCriterionBidLandscapeDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.ExperimentDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.FeedDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.FeedItemDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.FeedMappingDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.GeoLocationDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.LocationCriterionDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.ManagedCustomerDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.MediaDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.TargetingIdeaDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.TrafficEstimatorDelegate;
import com.google.api.ads.adwords.axis.utility.extension.delegates.UserListDelegate;
import com.google.api.ads.adwords.axis.utility.extension.util.AdWordsSessionUtil;
import com.google.api.ads.adwords.axis.v201402.mcm.ManagedCustomer;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

/**
 * DelegateLocator allows the developer to find all the Delegates for the AdWords API services.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class DelegateLocator{

  private final AdWordsSession adWordsSession;

  private volatile AdGroupAdDelegate adGroupAdDelegate;
  private volatile AdGroupCriterionDelegate adGroupCriterionDelegate;
  private volatile AdGroupBidModifierDelegate adGroupBidModifierDelegate;
  private volatile AdGroupFeedDelegate adGroupFeedDelegate;
  private volatile AdGroupDelegate adGroupDelegate;
  private volatile AdParamDelegate adParamDelegate;
  private volatile AlertDelegate alertDelegate;
  private volatile BudgetOrderDelegate budgetOrderDelegate;
  private volatile BudgetDelegate budgetDelegate;
  private volatile CampaignAdExtensionDelegate campaignAdExtensionDelegate;
  private volatile CampaignCriterionDelegate campaignCriterionDelegate;
  private volatile CampaignFeedDelegate campaignFeedDelegate;
  private volatile CampaignDelegate campaignDelegate;
  private volatile ConstantDataDelegate constantDataDelegate;
  private volatile ConversionTrackerDelegate conversionTrackerDelegate;
  private volatile CustomerSyncDelegate customerSyncDelegate;
  private volatile DataAdGroupBidLandscapeDelegate dataAdGroupBidLandscapeDelegate;
  private volatile DataCriterionBidLandscapeDelegate dataCriterionBidLandscapeDelegate;
  private volatile ExperimentDelegate experimentDelegate;
  private volatile FeedDelegate feedDelegate;
  private volatile FeedItemDelegate feedItemDelegate;
  private volatile FeedMappingDelegate feedMappingDelegate;
  private volatile GeoLocationDelegate geoLocationDelegate;
  private volatile LocationCriterionDelegate locationCriterionDelegate;
  private volatile ManagedCustomerDelegate managedCustomerDelegate;
  private volatile MediaDelegate mediaDelegate;
  private volatile TargetingIdeaDelegate targetingIdeaDelegate;
  private volatile TrafficEstimatorDelegate trafficEstimatorDelegate;
  private volatile UserListDelegate userListDelegate;

  /**
   * Constructor for DelegateLocator with it's own AdWordsSession.
   * Stores a new copy of the AdWordsSession specific for this ManagedCustomer (Account).
   *
   * @param adWordsSession the AdWordsSession for the ManagedCustomer
   */
  public DelegateLocator(AdWordsSession adWordsSession) {
    this.adWordsSession = AdWordsSessionUtil.copyWithUtilityUserAgent(adWordsSession);
  }

  /**
   * Constructor for DelegateLocator for a ManagedCustomer from
   * clientCustomerId.
   * Stores a new copy of the AdWordsSession specific for this ManagedCustomer (Account).
   *
   * @param adWordsSession the AdWordsSession for the ManagedCustomer
   * @param clientCustomerId the clientCustomerId as String for the AdWordsSession
   */
  public DelegateLocator(AdWordsSession adWordsSession, String clientCustomerId) {
    this.adWordsSession = AdWordsSessionUtil.copyWithUtilityUserAgent(adWordsSession);
    this.adWordsSession.setClientCustomerId(clientCustomerId);
  }

  /**
   * Constructor for DelegateLocator for a ManagedCustomer.
   * Stores a new copy of the AdWordsSession specific for this ManagedCustomer (Account).
   *
   * @param adWordsSession the AdWordsSession for the ManagedCustomer
   * @param managedCustomer the ManagedCustomer for the AdWordsSession
   */
  public DelegateLocator(AdWordsSession adWordsSession, ManagedCustomer managedCustomer) {
    String clientCustomerId = null;
    if (managedCustomer.getCustomerId() != null) {
      clientCustomerId = managedCustomer.getCustomerId().toString();
    }
    this.adWordsSession = AdWordsSessionUtil.copyWithUtilityUserAgent(adWordsSession);
    this.adWordsSession.setClientCustomerId(clientCustomerId);
  }

  /**
   * Constructor for DelegateLocator for a ManagedCustomer.
   * Stores a new copy of the AdWordsSession specific for this ManagedCustomer (Account).
   *
   * @param adWordsSession the AdWordsSession for the ManagedCustomer
   * @param managedCustomerDelegate
   */
  public DelegateLocator(AdWordsSession adWordsSession,
      ManagedCustomerDelegate managedCustomerDelegate,
      AdGroupAdDelegate adGroupAdDelegate,
      AdGroupBidModifierDelegate adGroupBidModifierDelegate,
      AdGroupCriterionDelegate adGroupCriterionDelegate,
      AdGroupFeedDelegate adGroupFeedDelegate,
      AdGroupDelegate adGroupDelegate,
      AdParamDelegate adParamDelegate,
      AlertDelegate alertDelegate,
      BudgetOrderDelegate budgetOrderDelegate,
      BudgetDelegate budgetDelegate,
      CampaignAdExtensionDelegate campaignAdExtensionDelegate,
      CampaignCriterionDelegate campaignCriterionDelegate,
      CampaignFeedDelegate campaignFeedDelegate,
      CampaignDelegate campaignDelegate,
      ConstantDataDelegate constantDataDelegate,
      ConversionTrackerDelegate conversionTrackerDelegate,
      CustomerSyncDelegate customerSyncDelegate,
      DataAdGroupBidLandscapeDelegate dataAdGroupBidLandscapeDelegate,
      DataCriterionBidLandscapeDelegate dataCriterionBidLandscapeDelegate,
      ExperimentDelegate experimentDelegate,
      FeedDelegate feedDelegate,
      FeedItemDelegate feedItemDelegate,
      FeedMappingDelegate feedMappingDelegate,
      GeoLocationDelegate geoLocationDelegate,
      LocationCriterionDelegate locationCriterionDelegate,
      MediaDelegate mediaDelegate,
      TargetingIdeaDelegate targetingIdeaDelegate,
      TrafficEstimatorDelegate trafficEstimatorDelegate,
      UserListDelegate userListDelegate) {
    this.adWordsSession = AdWordsSessionUtil.copyWithUtilityUserAgent(adWordsSession);
    this.managedCustomerDelegate = managedCustomerDelegate;
    this.adGroupAdDelegate = adGroupAdDelegate;
    this.adGroupBidModifierDelegate = adGroupBidModifierDelegate;
    this.adGroupCriterionDelegate = adGroupCriterionDelegate;
    this.adGroupFeedDelegate = adGroupFeedDelegate;
    this.adGroupDelegate = adGroupDelegate;
    this.adParamDelegate = adParamDelegate;
    this.alertDelegate = alertDelegate;
    this.budgetOrderDelegate = budgetOrderDelegate;
    this.budgetDelegate = budgetDelegate;
    this.campaignAdExtensionDelegate = campaignAdExtensionDelegate;
    this.campaignCriterionDelegate = campaignCriterionDelegate;
    this.campaignFeedDelegate = campaignFeedDelegate;
    this.campaignDelegate = campaignDelegate;
    this.constantDataDelegate = constantDataDelegate;
    this.conversionTrackerDelegate = conversionTrackerDelegate;
    this.customerSyncDelegate = customerSyncDelegate;
    this.dataAdGroupBidLandscapeDelegate = dataAdGroupBidLandscapeDelegate;
    this.dataCriterionBidLandscapeDelegate = dataCriterionBidLandscapeDelegate;
    this.experimentDelegate = experimentDelegate;
    this.feedDelegate = feedDelegate;
    this.feedItemDelegate = feedItemDelegate;
    this.feedMappingDelegate = feedMappingDelegate;
    this.geoLocationDelegate = geoLocationDelegate;
    this.locationCriterionDelegate = locationCriterionDelegate;
    this.mediaDelegate = mediaDelegate;
    this.targetingIdeaDelegate = targetingIdeaDelegate;
    this.trafficEstimatorDelegate = trafficEstimatorDelegate;
    this.userListDelegate = userListDelegate;
  }

  /**
   * Gets the AdWordsSession associated with this{@code DelegateLocator}.
   */
  public AdWordsSession getAdWordsSession() {
    return adWordsSession;
  }

  /**
   * Gets the ClientCustomerId associated with the{@code adWordsSession}.
   */
  public String getClientCustomerId() {
    return adWordsSession.getClientCustomerId();
  }

  /**
   * Gets the ManagedCustomerDelegate associated with the{@code adWordsSession}.
   */
  public ManagedCustomerDelegate getManagedCustomerDelegate() {
    if (managedCustomerDelegate == null) {
      synchronized (this) {
        if (managedCustomerDelegate == null) {
          managedCustomerDelegate = new ManagedCustomerDelegate(adWordsSession);
        }
      }
    }
    return managedCustomerDelegate;
  }

  /**
   * Gets the CampaignFeedDelegate associated with the{@code adWordsSession}.
   */
  public CampaignFeedDelegate getCampaignFeedDelegate() {
    if (campaignFeedDelegate == null) {
      synchronized (this) {
        if (campaignFeedDelegate == null) {
          campaignFeedDelegate = new CampaignFeedDelegate(adWordsSession);
        }
      }
    }
    return campaignFeedDelegate;
  }

  /**
   * Gets the CampaignDelegate associated with the{@code adWordsSession}.
   */
  public CampaignDelegate getCampaignDelegate() {
    if (campaignDelegate == null) {
      synchronized (this) {
        if (campaignDelegate == null) {
          campaignDelegate = new CampaignDelegate(adWordsSession);
        }
      }
    }
    return campaignDelegate;
  }

  /**
   * Gets the AdGroupBidModifierDelegate associated with the{@code adWordsSession}.
   */
  public AdGroupBidModifierDelegate getAdGroupBidModifierDelegate() {
    if (adGroupBidModifierDelegate == null) {
      synchronized (this) {
        if (adGroupBidModifierDelegate == null) {
          adGroupBidModifierDelegate = new AdGroupBidModifierDelegate(adWordsSession);
        }
      }
    }
    return adGroupBidModifierDelegate;
  }

  /**
   * Gets the AdGroupFeedDelegate associated with the{@code adWordsSession}.
   */
  public AdGroupFeedDelegate getAdGroupFeedDelegate() {
    if (adGroupFeedDelegate == null) {
      synchronized (this) {
        if (adGroupFeedDelegate == null) {
          adGroupFeedDelegate = new AdGroupFeedDelegate(adWordsSession);
        }
      }
    }
    return adGroupFeedDelegate;
  }

  /**
   * Gets the AdGroupDelegate associated with the{@code adWordsSession}.
   */
  public AdGroupDelegate getAdGroupDelegate() {
    if (adGroupDelegate == null) {
      synchronized (this) {
        if (adGroupDelegate == null) {
          adGroupDelegate = new AdGroupDelegate(adWordsSession);
        }
      }
    }
    return adGroupDelegate;
  }

  /**
   * Gets the AdGroupAdDelegate associated with the{@code adWordsSession}.
   */
  public AdGroupAdDelegate getAdGroupAdDelegate() {
    if (adGroupAdDelegate == null) {
      synchronized (this) {
        if (adGroupAdDelegate == null) {
          adGroupAdDelegate = new AdGroupAdDelegate(adWordsSession);
        }
      }
    }
    return adGroupAdDelegate;
  }

  /**
   * Gets the AdGroupCriterionDelegate associated with the{@code adWordsSession}.
   */
  public AdGroupCriterionDelegate getAdGroupCriterionDelegate() {
    if (adGroupCriterionDelegate == null) {
      synchronized (this) {
        if (adGroupCriterionDelegate == null) {
          adGroupCriterionDelegate = new AdGroupCriterionDelegate(adWordsSession, false);
        }
      }
    }
    return adGroupCriterionDelegate;
  }

  /**
   * Gets the CampaignCriterionDelegate associated with the{@code adWordsSession}.
   */
  public CampaignCriterionDelegate getCampaignCriterionDelegate() {
    if (campaignCriterionDelegate == null) {
      synchronized (this) {
        if (campaignCriterionDelegate == null) {
          campaignCriterionDelegate = new CampaignCriterionDelegate(adWordsSession);
        }
      }
    }
    return campaignCriterionDelegate;
  }

  /**
   * Gets the CampaignAdExtensionDelegate associated with the{@code adWordsSession}.
   */
  public CampaignAdExtensionDelegate getCampaignAdExtensionDelegate() {
    if (campaignAdExtensionDelegate == null) {
      synchronized (this) {
        if (campaignAdExtensionDelegate == null) {
          campaignAdExtensionDelegate = new CampaignAdExtensionDelegate(adWordsSession, false);
        }
      }
    }
    return campaignAdExtensionDelegate;
  }

  /**
   * Gets the AlertDelegate associated with the{@code adWordsSession}.
   */
  public AlertDelegate getAlertDelegate() {
    if (alertDelegate == null) {
      synchronized (this) {
        if (alertDelegate == null) {
          alertDelegate = new AlertDelegate(adWordsSession);
        }
      }
    }
    return alertDelegate;
  }

  /**
   * Gets the BudgetOrderDelegate associated with the{@code adWordsSession}.
   */
  public BudgetOrderDelegate getBudgetOrderDelegate() {
    if (budgetOrderDelegate == null) {
      synchronized (this) {
        if (budgetOrderDelegate == null) {
          budgetOrderDelegate = new BudgetOrderDelegate(adWordsSession, false);
        }
      }
    }
    return budgetOrderDelegate;
  }

  /**
   * Gets the BudgetDelegate associated with the{@code adWordsSession}.
   */
  public BudgetDelegate getBudgetDelegate() {
    if (budgetDelegate == null) {
      synchronized (this) {
        if (budgetDelegate == null) {
          budgetDelegate = new BudgetDelegate(adWordsSession);
        }
      }
    }
    return budgetDelegate;
  }

  /**
   * Gets the ConstantDataDelegate associated with the{@code adWordsSession}.
   */
  public ConstantDataDelegate getConstantDataDelegate() {
    if (constantDataDelegate == null) {
      synchronized (this) {
        if (constantDataDelegate == null) {
          constantDataDelegate = new ConstantDataDelegate(adWordsSession);
        }
      }
    }
    return constantDataDelegate;
  }

  /**
   * Gets the DataAdGroupBidLandscapeDelegate associated with the{@code adWordsSession}.
   */
  public DataAdGroupBidLandscapeDelegate getDataAdGroupBidLandscapeDelegate() {
    if (dataAdGroupBidLandscapeDelegate == null) {
      synchronized (this) {
        if (dataAdGroupBidLandscapeDelegate == null) {
          dataAdGroupBidLandscapeDelegate = new DataAdGroupBidLandscapeDelegate(adWordsSession);
        }
      }
    }
    return dataAdGroupBidLandscapeDelegate;
  }

  /**
   * Gets the DataCriterionBidLandscapeDelegate associated with the{@code adWordsSession}.
   */
  public DataCriterionBidLandscapeDelegate getDataCriterionBidLandscapeDelegate() {
    if (dataCriterionBidLandscapeDelegate == null) {
      synchronized (this) {
        if (dataCriterionBidLandscapeDelegate == null) {
          dataCriterionBidLandscapeDelegate = new DataCriterionBidLandscapeDelegate(adWordsSession);
        }
      }
    }
    return dataCriterionBidLandscapeDelegate;
  }

  /**
   * Gets the AdParamDelegate associated with the{@code adWordsSession}.
   */
  public AdParamDelegate getAdParamDelegate() {
    if (adParamDelegate == null) {
      synchronized (this) {
        if (adParamDelegate == null) {
          adParamDelegate = new AdParamDelegate(adWordsSession);
        }
      }
    }
    return adParamDelegate;
  }

  /**
   * Gets the CustomerSyncDelegate associated with the{@code adWordsSession}.
   */
  public CustomerSyncDelegate getCustomerSyncDelegate() {
    if (customerSyncDelegate == null) {
      synchronized (this) {
        if (customerSyncDelegate == null) {
          customerSyncDelegate = new CustomerSyncDelegate(adWordsSession);
        }
      }
    }
    return customerSyncDelegate;
  }

  /**
   * Gets the ExperimentDelegate associated with the{@code adWordsSession}.
   */
  public ExperimentDelegate getExperimentDelegate() {
    if (experimentDelegate == null) {
      synchronized (this) {
        if (experimentDelegate == null) {
          experimentDelegate = new ExperimentDelegate(adWordsSession);
        }
      }
    }
    return experimentDelegate;
  }

  /**
   * Gets the FeedDelegate associated with the{@code adWordsSession}.
   */
  public FeedDelegate getFeedDelegate() {
    if (feedDelegate == null) {
      synchronized (this) {
        if (feedDelegate == null) {
          feedDelegate = new FeedDelegate(adWordsSession);
        }
      }
    }
    return feedDelegate;
  }

  /**
   * Gets the FeedMappingDelegate associated with the{@code adWordsSession}.
   */
  public FeedItemDelegate getFeedItemDelegate() {
    if (feedItemDelegate == null) {
      synchronized (this) {
        if (feedItemDelegate == null) {
          feedItemDelegate = new FeedItemDelegate(adWordsSession);
        }
      }
    }
    return feedItemDelegate;
  }

  /**
   * Gets the FeedMappingDelegate associated with the{@code adWordsSession}.
   */
  public FeedMappingDelegate getFeedMappingDelegate() {
    if (feedMappingDelegate == null) {
      synchronized (this) {
        if (feedMappingDelegate == null) {
          feedMappingDelegate = new FeedMappingDelegate(adWordsSession);
        }
      }
    }
    return feedMappingDelegate;
  }

  /**
   * Gets the GeoLocationDelegate associated with the{@code adWordsSession}.
   */
  public GeoLocationDelegate getGeoLocationDelegate() {
    if (geoLocationDelegate == null) {
      synchronized (this) {
        if (geoLocationDelegate == null) {
          geoLocationDelegate = new GeoLocationDelegate(adWordsSession);
        }
      }
    }
    return geoLocationDelegate;
  }

  /**
   * Gets the LocationCriterionDelegate associated with the{@code adWordsSession}.
   */
  public LocationCriterionDelegate getLocationCriterionDelegate() {
    if (locationCriterionDelegate == null) {
      synchronized (this) {
        if (locationCriterionDelegate == null) {
          locationCriterionDelegate = new LocationCriterionDelegate(adWordsSession);
        }
      }
    }
    return locationCriterionDelegate;
  }


  /**
   * Gets the ConversionTrackerDelegate associated with the{@code adWordsSession}.
   */
  public ConversionTrackerDelegate getConversionTrackerDelegate() {
    if (conversionTrackerDelegate == null) {
      synchronized (this) {
        if (conversionTrackerDelegate == null) {
          conversionTrackerDelegate = new ConversionTrackerDelegate(adWordsSession);
        }
      }
    }
    return conversionTrackerDelegate;
  }

  /**
   * Gets the MediaDelegate associated with the{@code adWordsSession}.
   */
  public MediaDelegate getMediaDelegate() {
    if (mediaDelegate == null) {
      synchronized (this) {
        if (mediaDelegate == null) {
          mediaDelegate = new MediaDelegate(adWordsSession);
        }
      }
    }
    return mediaDelegate;
  }

  /**
   * Gets the TargetingIdeaDelegate associated with the{@code adWordsSession}.
   */
  public TargetingIdeaDelegate getTargetingIdeaDelegate() {
    if (targetingIdeaDelegate == null) {
      synchronized (this) {
        if (targetingIdeaDelegate == null) {
          targetingIdeaDelegate = new TargetingIdeaDelegate(adWordsSession);
        }
      }
    }
    return targetingIdeaDelegate;
  }

  /**
   * Gets the TrafficEstimatorDelegate associated with the{@code adWordsSession}.
   */
  public TrafficEstimatorDelegate getTrafficEstimatorDelegate() {
    if (trafficEstimatorDelegate == null) {
      synchronized (this) {
        if (trafficEstimatorDelegate == null) {
          trafficEstimatorDelegate = new TrafficEstimatorDelegate(adWordsSession);
        }
      }
    }
    return trafficEstimatorDelegate;
  }

  /**
   * Gets the UserListDelegate associated with the{@code adWordsSession}.
   */
  public UserListDelegate getUserListDelegate() {
    if (userListDelegate == null) {
      synchronized (this) {
        if (userListDelegate == null) {
          userListDelegate = new UserListDelegate(adWordsSession);
        }
      }
    }
    return userListDelegate;
  }
}
