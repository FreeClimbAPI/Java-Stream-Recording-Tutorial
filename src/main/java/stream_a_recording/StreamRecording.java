package main.java.stream_a_recording;

import com.vailsys.persephony.api.PersyClient;
import com.vailsys.persephony.KnownSizeInputStream;
import com.vailsys.persephony.api.PersyException;

public class StreamRecording {

  public static void main(String[] args) {
    String accountId = System.getenv("ACCOUNT_ID");
    String authToken = System.getenv("AUTH_TOKEN");
    String recordingId = "";

    streamRecording(recordingId, accountId, authToken);
  }

  public static void streamRecording(String recordingId, String accountId, String authToken) {
    PersyClient client;
    KnownSizeInputStream stream;

    try {
      // Create PersyClient object
      client = new PersyClient(accountId, authToken);

      /*
       * Make the request for the recording. Receiving an InputStream in return which
       * can be used to stream the recording.
       */
      stream = client.recordings.stream(recordingId);

    } catch (PersyException pe) {
      System.out.println(pe.getMessage());
    }
  }
}