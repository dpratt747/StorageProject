#!/bin/bash

PASSWORD="zxc123"

echo $PASSWORD | sudo -S service postgresql start
psql -d herdingcats -U postgres

