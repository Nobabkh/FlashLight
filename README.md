
# FlashLight

An Easy to use library for Android Led Flash.
This library is easy to initialize and easy to use.
Works for both front and back LED flash.


## Badges

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![](https://jitpack.io/v/Nobabkh/FlashLight.svg)](https://jitpack.io/#Nobabkh/FlashLight)
[![CodeFactor](https://www.codefactor.io/repository/github/nobabkh/flashlight/badge)](https://www.codefactor.io/repository/github/nobabkh/flashlight)


## Implementation

Step 1.Add it in your root build.gradle at the end of repositories:

```
  	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency:

```
  	dependencies {
	        implementation 'com.github.Nobabkh:FlashLight:1.2'
	}
```

After Implementation
The Steps are easy just Import and initialize
On your activity initialize it like this

```
  	public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FlashLight f = new FlashLight(this);
        f.LED_ON(FlashLight.BACK_FLASH);
        f.LED_ON(FlashLight.FRONT_FLASH);
    }
}
```
It have two useable methodes

```
  	public void LED_ON(int flashid);
    public void LED_OFF(int flashid);
```
These methodes takes a parameter as flash id that is predefined in FlashLight class
```
  	FlashLight.BACK_FLASH
    FlashLight.FRONT_FLASH
```
Methodes should be called with predefined parameters like this
```
  	LED_ON(FlashLight.BACK_FLASH);
    LED_ON(FlashLight.FRONT_FLASH);
    LED_OFF(FlashLight.BACK_FLASH);
    LED_OFF(FlashLight.FRONT_FLASH);
```

This Library is to reduce your work use it in your way
