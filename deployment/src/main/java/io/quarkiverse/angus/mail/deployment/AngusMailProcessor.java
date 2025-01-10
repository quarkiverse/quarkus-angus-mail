package io.quarkiverse.angus.mail.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.nativeimage.ServiceProviderBuildItem;

class AngusMailProcessor {

    private static final String FEATURE = "angus-mail";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    ServiceProviderBuildItem mailProviders() {
        return ServiceProviderBuildItem.allProvidersFromClassPath("jakarta.mail.Provider");
    }

    @BuildStep
    ServiceProviderBuildItem streamProviders() {
        return ServiceProviderBuildItem.allProvidersFromClassPath("jakarta.mail.util.StreamProvider");
    }
}
