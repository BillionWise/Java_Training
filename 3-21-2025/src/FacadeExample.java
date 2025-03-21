class AudioPlayer {
    void playAudio() {
        System.out.println("Playing Audio");
    }

    void stopAudio() {
        System.out.println("Stopping Audio");
    }
}


class VideoPlayer
{
    void playVideo(){
        System.out.println("Playing video");
    }

    void stopVideo(){
        System.out.println("Stopping video");
    }
}

class StreamingService{
    void startStreaming(){
        System.out.println("Starting streaming");
    }
    void stopStreaming(){
        System.out.println("Stopping streaming");
    }
}


class MultimediaFacade{
    private AudioPlayer audio;
    private VideoPlayer video;
    private StreamingService streaming;


    public MultimediaFacade(){
        this.audio = new AudioPlayer();
        this.video = new VideoPlayer();
        this.streaming = new StreamingService();



    }

    void stopSound(){
       audio.stopAudio();
    }
    void playSound(){
        audio.playAudio();
    }

    void stopVideo(){
        video.stopVideo();
    }

    void playVideo(){
        video.playVideo();
    }

    void stopStreaming(){
        streaming.stopStreaming();
    }

    void streamStart(){
        streaming.startStreaming();
            }
}


public class FacadeExample {
    public static void main(String[] args) {
        MultimediaFacade multimedia = new MultimediaFacade();

        multimedia.playVideo();
        multimedia.playSound();
        multimedia.streamStart();

        multimedia.stopStreaming();
        multimedia.stopSound();
        multimedia.stopVideo();
    }
}
