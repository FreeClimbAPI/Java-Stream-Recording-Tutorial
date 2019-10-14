# Java - Stream a Recording Tutorial

This project serves as a guide to help you build an application with Persephony. Specifically, the project will:

- Create a file stream of a recorded file made by persephony. Recordings are created when calls send a PerCL command to persephony to record. They can be seen in the recordings tab in the dashboard.   

## Setting up your new app within your Persephony account

To get started using a persephony account, follow the instructions [here](https://persephony-docs.readme.io/docs/getting-started-with-persephony).

## Setting up the Tutorial

1. Configure environment variables.

   | ENV VARIABLE            | DESCRIPTION                                                                                                                                                                             |
   | ----------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
   | ACCOUNT_ID              | Account ID which can be found under [API Keys](https://www.persephony.com/dashboard/portal/account/authentication) in Dashboard                                                         |
   | AUTH_TOKEN              | Authentication Token which can be found under [API Keys](https://www.persephony.com/dashboard/portal/account/authentication) in Dashboard                                               |

2. Provide a value for the variable `recordingId` in streamARecording.js. If you have created a recording, you will be able to get the recordingId from the recordings tab in your dashboard. To find out more about recordings, check out the [recording documentation](https://docs.persephony.com/docs/recordings-3)

## Building and Runnning the Tutorial

1. Build and run the application using command:

   ```bash
   $ gradle build && java -Dserver.port=3000 -jar build/libs/gs-spring-boot-0.1.0.jar
   ```
