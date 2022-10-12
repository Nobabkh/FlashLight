package dev.nobabkhan.flashlight;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FlashLight {

    private Camera mCamera;
    private Camera.Parameters parameters;
    private CameraManager camManager;
    private String[] cameraId = null;
    private static AppCompatActivity a;
    public static final int FRONT_FLASH = 1;
    public static final int BACK_FLASH = 0;
    public static void initialize(AppCompatActivity ac)
    {
        a = ac;
    }
    public FlashLight(AppCompatActivity ac)
    {
        this.a = ac;
        activate_fash();
    }
    public void LED_ON(int camid)
    {
        if(camid >= cameraId.length)
        {
            camid = 0;
        }
        try {
            this.camManager.setTorchMode(cameraId[camid], true);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    public void LED_OFF(int camid)
    {
        if(camid >= cameraId.length)
        {
            camid = 0;
        }
        try {
            this.camManager.setTorchMode(cameraId[camid], false);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }


    private void activate_fash() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            try {
                camManager = (CameraManager) a.getSystemService(Context.CAMERA_SERVICE);

                if (camManager != null) {
                    cameraId = camManager.getCameraIdList();


                }
            } catch (CameraAccessException e) {
                Toast.makeText(a, "Error", Toast.LENGTH_SHORT).show();
            }
        } else {
            mCamera = Camera.open();
            parameters = mCamera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            mCamera.setParameters(parameters);
            mCamera.startPreview();
        }
    }

}
