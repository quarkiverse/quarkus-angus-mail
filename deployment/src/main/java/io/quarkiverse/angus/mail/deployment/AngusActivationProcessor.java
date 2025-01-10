package io.quarkiverse.angus.mail.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.nativeimage.ServiceProviderBuildItem;

class AngusActivationProcessor {

    @BuildStep
    ServiceProviderBuildItem mailcapRegistryProviders() {
        return ServiceProviderBuildItem.allProvidersFromClassPath("jakarta.activation.spi.MailcapRegistryProvider");
    }

    @BuildStep
    ServiceProviderBuildItem mimeTypeRegistryProviders() {
        return ServiceProviderBuildItem.allProvidersFromClassPath("jakarta.activation.spi.MimeTypeRegistryProvider");
    }
}
