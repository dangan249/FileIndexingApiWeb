package info.andang.api;

import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FileIndexingApiWeb extends Application<FileIndexingApiWebConfiguration> {

  public static void main(String[] args) throws Exception {
    new FileIndexingApiWeb().run(args);
  }

  @Override
  public void initialize(Bootstrap<FileIndexingApiWebConfiguration> bootstrap) {

    GuiceBundle<FileIndexingApiWebConfiguration> guiceBundle = GuiceBundle.<FileIndexingApiWebConfiguration>newBuilder()
        .addModule(new FileIndexingApiWebModule())
        .enableAutoConfig(getClass().getPackage().getName())
        .setConfigClass(FileIndexingApiWebConfiguration.class)
        .build();

    bootstrap.addBundle(guiceBundle);
  }

  @Override
  public String getName() {
    return "file-indexing-api-web";
  }

  @Override
  public void run(FileIndexingApiWebConfiguration fileIndexingApiWebConfiguration, Environment environment) throws Exception {
  }
}