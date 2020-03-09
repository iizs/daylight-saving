#!/bin/bash

if [ ! $# == 2 ]; then
    echo "Usage: $0 id logfile"
    exit 1
fi

DATE_LOCAL=`date`
DATE_UTC=`date --utc`

LOG_DIR=/home/centos/log/crontab
LOG_FILE=${LOG_DIR}/${2}.log
OUTPUT="${DATE_LOCAL} | ${DATE_UTC} | ${1}"

echo "${OUTPUT}" >> ${LOG_FILE}
