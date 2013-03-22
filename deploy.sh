#!/bin/bash

echo "[INFO] Deploying..."

PROJECT=FMCoachRoles
WEBAPPS=`cygpath ${TOMCAT}/webapps`
DIR=${WEBAPPS}/${PROJECT}
WAR=${DIR}.war
if [[ -f ${WAR} ]];then
    echo "[INFO] Removing WAR"
    rm -fr ${WAR}
fi

if [[ -d ${DIR} ]];then
    echo "[INFO] Removing DIR"
    rm -fr ${DIR}
fi

echo "[INFO] Deploying WAR"
cp target/${PROJECT}.war ${WEBAPPS}
echo "[INFO] Done"

echo "[INFO] Remember this is Spring MVC - you can't just go to the root context"
echo "[INFO] http://localhost:8080/FMCoachRoles/index.html"