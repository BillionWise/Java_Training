class AudioPlayer {
    void playAudio() {
        System.out.println("Playing Audio");
    }
}


class VideoPlayer
{
    void playVideo(){
        System.out.println("Playing video");
    }
}

class StreamingService{
    void startStreaming(){
        System.out.println("Starting streaming");
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

    void playSound(){
        audio.playAudio();
    }

    void playVideo(){
        video.playVideo();
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
    }
}
