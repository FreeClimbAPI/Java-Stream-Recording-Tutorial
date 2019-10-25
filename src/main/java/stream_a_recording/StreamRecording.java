package main.java.stream_a_recording;

import com.vailsys.freeclimb.api.FreeClimbClient;
import com.vailsys.freeclimb.KnownSizeInputStream;
import com.vailsys.freeclimb.api.FreeClimbException;

public class StreamRecording {

  public static void main(String[] args) {
    String accountId = System.getenv("ACCOUNT_ID");
    String authToken = System.getenv("AUTH_TOKEN");
    String recordingId = "";

    streamRecording(recordingId, accountId, authToken);
  }

  public static void streamRecording(String recordingId, String accountId, String authToken) {
    FreeClimbClient client;
    KnownSizeInputStream stream;

    try {
      // Create FreeClimbClient object
      client = new FreeClimbClient(accountId, authToken);

      /*
       * Make the request for the recording. Receiving an InputStream in return which
       * can be used to stream the recording.
       */
      stream = client.recordings.stream(recordingId);

    } catch (FreeClimbException pe) {
      System.out.println(pe.getMessage());
    }
  }
}