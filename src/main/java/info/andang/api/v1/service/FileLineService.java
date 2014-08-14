package info.andang.api.v1.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class FileLineService {

  private final String sourceFilePath;

  @Inject
  public FileLineService(@Named("source.file.path") String sourceFilePath) {
    this.sourceFilePath = sourceFilePath;
  }

  public String getLineAtIndex(int index){
    return sourceFilePath;
  }
}
