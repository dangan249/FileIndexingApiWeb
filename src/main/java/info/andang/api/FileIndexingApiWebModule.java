package info.andang.api;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.hubspot.liveconfig.LiveConfig;

public class FileIndexingApiWebModule extends AbstractModule {

  private  final LiveConfig config = LiveConfig.builder()
      .usingEnvironmentVariables()
      .usingSystemProperties()
      .build();

  @Override
  protected void configure() {
  }

  @Provides
  @Named("source.file.path")
  public String getSourceFilePath(FileIndexingApiWebConfiguration configuration) {
    return config.getString("fileindexingapiwebmodule.file.path");
  }
}