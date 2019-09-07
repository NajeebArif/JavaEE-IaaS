FROM narif/wildfly-admin:1

LABEL maintainer="najeeb.oo7.dd@gmail.com"

COPY target/carshop.war $DEPLOYMENT_DIR