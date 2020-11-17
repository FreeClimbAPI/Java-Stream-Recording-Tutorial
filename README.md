# Java - Stream a Recording Tutorial

This project serves as a guide to help you build an application with FreeClimb. View this tutorial on [FreeClimb.com](https://docs.freeclimb.com/docs/stream-a-recording#section-java). Specifically, the project will:

- Create a file stream of a recorded file made by FreeClimb. Recordings are created when calls send a PerCL command to FreeClimb to record. They can be seen in the recordings tab in the dashboard.

## Setting up your new app within your FreeClimb account

To get started using a FreeClimb account, follow the instructions [here](https://docs.freeclimb.com/docs/getting-started-with-freeclimb).

## Setting up the Tutorial

1. Configure environment variables.

   | ENV VARIABLE | DESCRIPTION                                                                                                                              |
   | ------------ | ---------------------------------------------------------------------------------------------------------------------------------------- |
   | ACCOUNT_ID   | Account ID which can be found under [API Keys](https://www.freeclimb.com/dashboard/portal/account/authentication) in Dashboard           |
   | AUTH_TOKEN   | Authentication Token which can be found under [API Keys](https://www.freeclimb.com/dashboard/portal/account/authentication) in Dashboard |

2. Provide a value for the variable `recordingId` in StreamARecording.java. If you have created a recording, you will be able to get the recordingId from the recordings tab in your dashboard. To find out more about recordings, check out the [recording documentation](https://docs.freeclimb.com/docs/recordings-3)

## Building and Runnning the Tutorial

1. Build and run the application using command:

   ```bash
   $ gradle build && java -Dserver.port=3000 -jar build/libs/gs-spring-boot-0.1.0.jar
   ```

## Getting Help

If you are experiencing difficulties, [contact support](https://freeclimb.com/support).
