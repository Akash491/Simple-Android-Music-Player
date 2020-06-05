# Simple-Android-Music-Player

Android provides many ways to control playback of audio/video files and streams. One of this way is through a class called MediaPlayer.
Android is providing MediaPlayer class to access built-in mediaplayer services like playing audio,video e.t.c.

In order to use MediaPlayer, we have to call a static Method create() of this class. 

This method returns an instance of MediaPlayer class. Its syntax is as follows ?

MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);

The second parameter is the name of the song that you want to play.
You have to make a new folder under your project with name raw and place the music file into it.

Once you have created the Mediaplayer object you can call some methods to start or stop the music.

These methods are listed below.

mediaPlayer.start();

mediaPlayer.pause();

On call to start() method, the music will start playing from the beginning.

If this method is called again after the pause() method, the music would start playing from where it is left and not from the beginning.

In order to start music from the beginning, you have to call reset() method.

Its syntax is given below.

mediaPlayer.reset();
