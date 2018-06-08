[<img src="http://sling.apache.org/res/logos/sling.png"/>](http://sling.apache.org)

 [![Build Status](https://builds.apache.org/buildStatus/icon?job=sling-org-apache-sling-commons-messaging-1.8)](https://builds.apache.org/view/S-Z/view/Sling/job/sling-org-apache-sling-commons-messaging-1.8) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)

# Apache Sling Commons Messaging

This module is part of the [Apache Sling](https://sling.apache.org) project.

Simple API for sending *message*​s to *recipient*​s.

`MessageService`
----------------
  * `send(String, String)` - takes a *message*​ and a *recipient*, e.g.
    * send("A Message to You, Rudy", "rudy@ghosttown") - send a mail to Rudy in Ghost Town
    * send("Hello Apache!", "+1.919.573.9199") - send a fax to the ASF
  * `send(String, String, Map)` - takes a *message*, a *recipient* and additional *data* useful for the underlying implementation to process and/or send the message

`Result<T>`
-----------
  * `getMessage():T` - should return a serialized form of the sent *message*
