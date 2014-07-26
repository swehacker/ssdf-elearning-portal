package se.ssdf.elearning.common;

/**
 * RunProfile is used with maven build tool to set the current profile currently used to start the system.
 */
public interface RunProfile {
    /** Production like environment, no tests **/
    String PRODUCTION = "prod";
    /** Acceptance test profile **/
    String ACCEPTANCE = "acceptance";
    /** Remote Build Environment Tests only **/
    String TEST = "test";
    /** Local Build Environment Tests **/
    String DEVELOPMENT = "dev";
}
