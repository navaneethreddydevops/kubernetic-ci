package io.harbur.properties

import io.harbur.properties.Tag
import io.harbur.properties.Registry

class Rollout {
    def resource
    def namespace
    def branch

    Rollout(yaml) {
        this.resource = yaml.resource
        this.namespace = yaml.namespace
        this.branch = yaml.branch
    }
}