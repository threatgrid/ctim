# Sorting CTIM Entities

## Description

In APIs or views that contain collections of CTIM model objects,
sorting is defined by the following rules.

### Judgements

Judgements are sorted by the following fields, in order of preference:

1. Validity: Is the current time within the `valid_time` range?
2. `disposition`
3. `valid_time`, `start_time` (oldest first)

### Sightings

Sightings are sorted by the following field:

1. `observed_time`, `start_time`
