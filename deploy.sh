#!/bin/bash

#######################################
# This file is part of FM Coach Roles.
# 
# FM Coach Roles is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
# 
# FM Coach Roles is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
# 
# You should have received a copy of the GNU General Public License
# along with FM Coach Roles.  If not, see <http://www.gnu.org/licenses/>.
#######################################

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
