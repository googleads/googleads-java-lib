#!/bin/bash

#
# This is a build script for the fork of the google ads-lib
# (https://github.com/googleads/googleads-java-lib).
#
# This fork doesn't contain any code changes, it's just using the Maven's shade
# plugin to relocate the Google's Guava library and the joda-time library,
# because we're using different versions in our application.
# Also, it contains the publishing URLs (Kinja's nexus).
#
# If you want to sync this fork with the latest version just merge the master
# with the original master and run the compile & test. If everything is fine
# then merge the master into this branch (shade-plugin).
#

DEFAULT_VERSION=1.36.1-KINJA-SHADED
# you can override the default version number by setting the first CLI parameter
VERSION=${1:-$DEFAULT_VERSION}

mvn versions:set -DnewVersion=$VERSION

# because of shading, we cannot run compile and deploy at the same time.
mvn clean compile

# shading break the tests, so let's disable them.
mvn install -Dmaven.test.skip=true -DskipTests && mvn deploy -Dmaven.test.skip=true -DskipTests
