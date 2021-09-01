package javaFeature.lambda.commandpattern;

public class TvClient {                                         // client
    public static void main(String[] args) {
        Tv tv = new Tv();                                       // receiver

//        Command onCommand = new OnCommand(tv);                  // command
//        Command offCommand = new OffCommand(tv);                // command
//        OnCommand, OffCommand not needed, can be deleted

        RemoteControl remoteControl = new RemoteControl();      // invoker
        //remoteControl.press(onCommand);
        remoteControl.press(() -> tv.switchOff());
        remoteControl.press(tv::switchOff);
    }
}
