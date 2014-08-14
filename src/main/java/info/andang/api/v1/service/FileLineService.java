package info.andang.api.v1.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.jramoyo.io.IndexedFileReader;

import java.io.File;
import java.io.IOException;

public class FileLineService {

  private final String sourceFilePath;
  private final IndexedFileReader reader;
  private final int maxIndex;

  @Inject
  public FileLineService(@Named("source.file.path") String sourceFilePath) throws IOException {
    this.sourceFilePath = sourceFilePath;
    reader = new IndexedFileReader(new File(sourceFilePath));
    this.maxIndex = 0;
  }

  public String getLineAtIndex(int index) throws IOException {
    return reader.readLines(index, index + 1).get(index);
  }
}
