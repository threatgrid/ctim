#!/bin/bash

PROJECT_VERSION=$(lein project-version)

if [[ "$PROJECT_VERSION" == *-SNAPSHOT ]]; then
  lein with-profile +deploy deploy
else
  lein with-profile +deploy release :patch
fi
