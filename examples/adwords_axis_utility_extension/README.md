AdWords Axis Utility Extension - Beta
=====================================

Utility (Beta) is a higher level client library on top of the new Java Client library.
It allows you to forget selectors, services, fields, mutates, gets.


Overview
--------

The main objective of the Utility Classes is to simplify the AdWords API services and reduce
the code that is often repeated when working with Fields, Selectors, Predicates, Gets and Mutates.
By adding a layer over these services it is possible to abstract many of the underlying concepts
and add extra utilities commonly needed by many AdWords developers.

Firstly, the AbstractGetDelegate encapsulates the most commonly used selectors along with their
predicates and fields, this allows it to implement all the main Get functions (get all objects of
the associated type, get by a single field value, by a list of field values or by selector)
in a generic way that the specific Delegates can reuse.

Secondly, the AbstractGetMutateDelegate adds the modification functionalities.
Its main functions are insert, update and remove, encapsulating operations, operands and mutates.
For completeness it also exposes a general mutate for more complex mix of operations
not supported in the layer.

Finally, there is a Specific Delegate per Service that adds all the server specific
client library objects, fields and ids, and also groups all the specific methods available
per AdWords service and enforces restrictions over the general classes.
For example, The CampaignDelegate exposes only methods for the Campaign level and restricts
the use of remove because it is not available in the Campaign Service. Just with an AdWordsSession
in the constructor and four principal methods it offers the functionalities most used by developers
without much of the complexity.


Extended Objects
----------------

Extended Objects add to regular client library objects and encapsulate all the Utility Delegates
within. The main objective of this abstraction is to make all AdWords services part of the objects
in four different horizontal levels, MCC, ManagedCustomer, Campaign and AdGroup.

The benefit this offers is that developers can make AdWords operations at each level to the level’s
correspondent objects in a more intuitive way. Each object is added to the parent where it belongs,
for example, adding an Account is in ExtendedMCC, adding a Campaign is in ExtendedManagedCustomer,
adding an AdGroup is in ExtendedCampaign and so on.

In a similar way, retrieving information can be done at each level, for example AdGroups can be
retrieved from the Campaign Level using ExtendedCampaign or, to retrieve them for all campaigns,
from the Account Level using ExtendedManagedCustomer, etc.


Goals
-----

* Bring a further abstraction to the current Java Client Library framework to allow faster
  learning and development;

* Provide some protection from the constant changes in the underlying API, so that developers
  can work more on adding new functionality, and less on running to keep still;

* Lifting the underlying base operations that are hardest to understand and code into the Objects
  they serve, so that complicated calls to the Services don’t have to be directly built by the
  developer;


Non-Goals
---------

* Produce a replacement for the current Java Client Library. On the contrary, the new Utility
  classes extend already existing objects and services.

* Add more work to developers, migrating to a new Utility release has to be easier and shorter
  than migrating to new client library without using Utility.


Where do I submit bug reports, feature requests and patches?
------------------------------------------------------------

All of these items can be submitted at
https://github.com/googleads/googleads-java-lib/issues

Authors:
    Julian Toledo
