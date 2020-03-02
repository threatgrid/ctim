#!/bin/bash

PROJECT_VERSION=$(lein project-version)

if [[ "$PROJECT_VERSION" == *-SNAPSHOT ]]; then
  lein with-profile +deploy deploy
else
  echo "TravisCI release deployment not yet implemented, doing nothing."
  #lein with-profile +deploy release :patch
fi
