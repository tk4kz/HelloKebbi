package com.example.hellokebbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.nuwarobotics.service.IClientId;
import com.nuwarobotics.service.agent.NuwaRobotAPI;
import com.nuwarobotics.service.agent.RobotEventListener;
import com.nuwarobotics.service.agent.VoiceEventListener;

public class MainActivity extends AppCompatActivity {

    private NuwaRobotAPI mRobot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init Nuwa sdk
        String your_app_package_name = getPackageName();
        IClientId id = new IClientId(your_app_package_name);
        mRobot = new NuwaRobotAPI(this, id);

        // register Nuwa Robot Listener
        registerNuwaRobotListener();
    }

    void registerNuwaRobotListener() {
        mRobot.registerRobotEventListener(new RobotEventListener() {
            @Override
            public void onWikiServiceStart() {
                Log.d("KEBBI", "onWikiServiceStart");
                //mRobot.startTTS("こんにちは、私はケビーです。");
                mRobot.startTTS(String.valueOf(R.string.hello_text));
            }

            @Override
            public void onWikiServiceStop() {

            }

            @Override
            public void onWikiServiceCrash() {

            }

            @Override
            public void onWikiServiceRecovery() {

            }

            @Override
            public void onStartOfMotionPlay(String s) {

            }

            @Override
            public void onPauseOfMotionPlay(String s) {

            }

            @Override
            public void onStopOfMotionPlay(String s) {

            }

            @Override
            public void onCompleteOfMotionPlay(String s) {

            }

            @Override
            public void onPlayBackOfMotionPlay(String s) {

            }

            @Override
            public void onErrorOfMotionPlay(int i) {

            }

            @Override
            public void onPrepareMotion(boolean b, String s, float v) {

            }

            @Override
            public void onCameraOfMotionPlay(String s) {

            }

            @Override
            public void onGetCameraPose(float v, float v1, float v2, float v3, float v4, float v5, float v6, float v7, float v8, float v9, float v10, float v11) {

            }

            @Override
            public void onTouchEvent(int i, int i1) {

            }

            @Override
            public void onPIREvent(int i) {

            }

            @Override
            public void onTap(int i) {

            }

            @Override
            public void onLongPress(int i) {

            }

            @Override
            public void onWindowSurfaceReady() {

            }

            @Override
            public void onWindowSurfaceDestroy() {

            }

            @Override
            public void onTouchEyes(int i, int i1) {

            }

            @Override
            public void onRawTouch(int i, int i1, int i2) {

            }

            @Override
            public void onFaceSpeaker(float v) {

            }

            @Override
            public void onActionEvent(int i, int i1) {

            }

            @Override
            public void onDropSensorEvent(int i) {

            }

            @Override
            public void onMotorErrorEvent(int i, int i1) {

            }
        });

        mRobot.registerVoiceEventListener(new VoiceEventListener() {
            @Override
            public void onWakeup(boolean b, String s, float v) {

            }

            @Override
            public void onTTSComplete(boolean b) {
                Log.d("KEBBI", "onTTSComplete:" + b);
            }

            @Override
            public void onSpeechRecognizeComplete(boolean b, ResultType resultType, String s) {

            }

            @Override
            public void onSpeech2TextComplete(boolean b, String s) {

            }

            @Override
            public void onMixUnderstandComplete(boolean b, ResultType resultType, String s) {

            }

            @Override
            public void onSpeechState(ListenType listenType, SpeechState speechState) {

            }

            @Override
            public void onSpeakState(SpeakType speakType, SpeakState speakState) {

            }

            @Override
            public void onGrammarState(boolean b, String s) {

            }

            @Override
            public void onListenVolumeChanged(ListenType listenType, int i) {

            }

            @Override
            public void onHotwordChange(HotwordState hotwordState, HotwordType hotwordType, String s) {

            }
        });
    }
}