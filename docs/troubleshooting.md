# Troubleshooting

## logcat


```shell

2022-05-18 12:59:13.971 8057-8057/? W/SELinux: SELinux selinux_android_compute_policy_index : Policy Index[2],  Con:u:r:zygote:s0 RAM:SEPF_SM-G935S_8.0.0_0018, [-1 -1 -1 -1 0 1]
2022-05-18 12:59:13.977 8057-8057/? I/SELinux: SELinux: seapp_context_lookup: seinfo=untrusted, level=s0:c512,c768, pkgname=com.dji.sdk.sample 
2022-05-18 12:59:15.314 8057-8057/com.dji.sdk.sample V/com.dji.sdk.sample.internal.view.MainContent: initUI
2022-05-18 12:59:15.606 8057-8057/com.dji.sdk.sample I/IP:: 192.168.123.86
2022-05-18 12:59:15.609 8057-8057/com.dji.sdk.sample I/WebServer: Start WebServer 192.168.123.86:8888
2022-05-18 12:59:15.723 8057-8057/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: Comes into the onAttachedToWindow
2022-05-18 12:59:15.724 8057-8057/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: mProduct: null
2022-05-18 12:59:15.740 8057-8057/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: dispatchAttachedToWindow
2022-05-18 12:59:15.798 8057-8057/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 12:59:18.041 8057-8057/com.dji.sdk.sample D/ViewRootImpl@429f914[Toast]: MSG_RESIZED_REPORT: frame=Rect(325, 1636 - 754, 1752) ci=Rect(0, 0 - 0, 0) vi=Rect(0, 0 - 0, 0) or=1
2022-05-18 12:59:18.045 8057-8523/com.dji.sdk.sample E/DJISDKManager: Failed to load LDM Plus license file /storage/emulated/0/DJI/com.dji.sdk.sample.dlf (No such file or directory)
2022-05-18 12:59:18.101 8057-8554/com.dji.sdk.sample D/NetworkSecurityConfig: No Network Security Config specified, using platform default
2022-05-18 12:59:18.726 8057-8554/com.dji.sdk.sample W/System.err: java.lang.NoSuchMethodException: getInstance []
2022-05-18 12:59:18.726 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Class.getMethod(Class.java:2068)
2022-05-18 12:59:18.726 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Class.getMethod(Class.java:1690)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.nhf.getDataBaseInstRefl(Unknown Source:14)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK$CmdIdType.<init>(Unknown Source:12)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK$CmdIdType.<clinit>(Unknown Source:252)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK$CmdIdType.getValues(Unknown Source:0)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK.fdd(Unknown Source:0)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.fdd.<init>(Unknown Source:10)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK.<init>(Unknown Source:0)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdSet.<clinit>(Unknown Source:762)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.nhf.<init>(Unknown Source:97)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.hjn.<init>(Unknown Source:35)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.DJIVideoPackManager.<init>(Unknown Source:1)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.DJIVideoPackManager.getInstance(Unknown Source:9)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.link.fdd.gfd(Unknown Source:36)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.link.fdd.<init>(Unknown Source:10)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.link.fdd.getInstance(Unknown Source:9)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.ServiceManager.ddf(Unknown Source:30)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.dgh.fdd(Unknown Source:27)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.fdd.fdd(Unknown Source:6)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initParams(Unknown Source:15)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initSDKManager(Unknown Source:12)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.registerApp(Unknown Source:37)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.access$1000(Unknown Source:0)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8$1.onDownloadSuccess(Unknown Source:8)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.internal.jhg.fdd.fdd(Unknown Source:19)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8.run(Unknown Source:37)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.dgh.gfd$fdd.run(Unknown Source:5)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:18.729 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:18.784 8057-8554/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: start accessory receiver
2022-05-18 12:59:18.805 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: receive action: android.hardware.usb.action.USB_STATE
2022-05-18 12:59:18.806 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: android.hardware.usb.action.USB_STATE: is connected
2022-05-18 12:59:18.836 8057-8671/com.dji.sdk.sample D/logWrite.cpp: UDT JNI_OnLoad---------------->
2022-05-18 12:59:18.836 8057-8671/com.dji.sdk.sample D/logWrite.cpp: UDP jniRegisterNativeMethods: jniRegisterNativeMethods
2022-05-18 12:59:18.836 8057-8671/com.dji.sdk.sample D/logWrite.cpp: loaded UDT :JNI_OnLoad() go to end
2022-05-18 12:59:18.844 8057-8554/com.dji.sdk.sample D/BluetoothAdapter: STATE_BLE_ON
2022-05-18 12:59:18.845 8057-8554/com.dji.sdk.sample D/BluetoothAdapter: STATE_BLE_ON
2022-05-18 12:59:18.845 8057-8554/com.dji.sdk.sample D/BluetoothAdapter: appoCount is = 1
2022-05-18 12:59:18.849 8057-8554/com.dji.sdk.sample D/BluetoothAdapter: STATE_BLE_ON
2022-05-18 12:59:18.850 8057-8554/com.dji.sdk.sample D/BluetoothAdapter: STATE_BLE_ON
2022-05-18 12:59:18.851 8057-8554/com.dji.sdk.sample D/BluetoothAdapter: appoCount is = 1
2022-05-18 12:59:18.865 8057-8705/com.dji.sdk.sample E/Lightbridge: Failed to obtain JNIEnv
2022-05-18 12:59:18.866 8057-8706/com.dji.sdk.sample E/Lightbridge: Failed to obtain JNIEnv
2022-05-18 12:59:18.866 8057-8707/com.dji.sdk.sample E/Lightbridge: Failed to obtain JNIEnv
2022-05-18 12:59:18.866 8057-8708/com.dji.sdk.sample E/Lightbridge: Failed to obtain JNIEnv
2022-05-18 12:59:18.867 8057-8709/com.dji.sdk.sample E/Lightbridge: Failed to obtain JNIEnv
2022-05-18 12:59:18.867 8057-8710/com.dji.sdk.sample E/Lightbridge: Failed to obtain JNIEnv
2022-05-18 12:59:18.893 8057-8554/com.dji.sdk.sample E/DJIComponentManager: Service Not Connected
2022-05-18 12:59:19.237 8057-8554/com.dji.sdk.sample D/CertificatePolicyCache: Creating new instance of CertificatePolicyCache myUid: 10466 callingUid: 10466
2022-05-18 12:59:19.237 8057-8554/com.dji.sdk.sample D/CertificatePolicyCache: readVariables type: null userId: 0
2022-05-18 12:59:19.525 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):Reading from variable values from setDefaultValuesToVariables
2022-05-18 12:59:19.526 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:19.526 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:19.526 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:19.526 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:19.526 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:19.722 8057-8554/com.dji.sdk.sample D/UPGRADE_JNI: Upgrade SDK JNI_OnLoad---------------->
2022-05-18 12:59:19.728 8057-8554/com.dji.sdk.sample D/UPGRADE_JNI: Upgrade SDK JNI_OnLoad----------------> finished
2022-05-18 12:59:19.838 8057-8554/com.dji.sdk.sample W/System.err: javax.crypto.IllegalBlockSizeException: last block incomplete in decryption
2022-05-18 12:59:19.839 8057-8554/com.dji.sdk.sample W/System.err:     at com.android.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineDoFinal(BaseBlockCipher.java:1143)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at javax.crypto.Cipher.doFinal(Cipher.java:1736)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.encryption.util.AES256Encryption.decrypt(Unknown Source:31)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:7)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:8)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:2)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:2)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeLogicAdapter.fdd(Unknown Source:4)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeAdapterManager.nhf(Unknown Source:9)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.dgh.fdd.fdd(Unknown Source:11)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.gfd.fdd(Unknown Source:28)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initParams(Unknown Source:24)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initSDKManager(Unknown Source:12)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.registerApp(Unknown Source:37)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.access$1000(Unknown Source:0)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8$1.onDownloadSuccess(Unknown Source:8)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.internal.jhg.fdd.fdd(Unknown Source:19)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8.run(Unknown Source:37)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.dgh.gfd$fdd.run(Unknown Source:5)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err: javax.crypto.IllegalBlockSizeException: last block incomplete in decryption
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at com.android.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineDoFinal(BaseBlockCipher.java:1143)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at javax.crypto.Cipher.doFinal(Cipher.java:1736)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.encryption.util.AES256Encryption.decrypt(Unknown Source:31)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:7)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:8)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:8)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:2)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeLogicAdapter.fdd(Unknown Source:4)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeAdapterManager.nhf(Unknown Source:9)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.dgh.fdd.fdd(Unknown Source:11)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.gfd.fdd(Unknown Source:28)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initParams(Unknown Source:24)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initSDKManager(Unknown Source:12)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.registerApp(Unknown Source:37)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.access$1000(Unknown Source:0)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8$1.onDownloadSuccess(Unknown Source:8)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.internal.jhg.fdd.fdd(Unknown Source:19)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8.run(Unknown Source:37)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.dgh.gfd$fdd.run(Unknown Source:5)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:19.925 8057-8211/com.dji.sdk.sample E/DJIComponentManager: Service Not Connected
2022-05-18 12:59:19.997 8057-8057/com.dji.sdk.sample D/ViewRootImpl@429f914[Toast]: dispatchDetachedFromWindow
2022-05-18 12:59:20.000 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'ef30393 Toast (client)' ~ Disposing input event receiver.
2022-05-18 12:59:20.001 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'ef30393 Toast (client)' ~NativeInputEventReceiver.
2022-05-18 12:59:20.363 8057-8857/com.dji.sdk.sample I/System.out: CommonThreadPool#5 calls detatch()
2022-05-18 12:59:20.390 8057-8925/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:20.393 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:20.393 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:20.393 8057-8925/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:20.465 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:20.710 8057-8948/com.dji.sdk.sample I/System.out: CommonThreadPool#8 calls detatch()
2022-05-18 12:59:20.721 8057-8554/com.dji.sdk.sample D/NFZ JNI: FS SDK JNI_OnLoad---------------->
2022-05-18 12:59:20.730 8057-8554/com.dji.sdk.sample D/NFZ JNI: FS SDK JNI_OnLoad----------------> finished
2022-05-18 12:59:20.798 8057-8926/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:20.799 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:20.799 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:20.799 8057-8926/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:20.803 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: getModel: com.dji.logiclink
2022-05-18 12:59:20.804 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: currentModel saved: LOGIC_LINK
2022-05-18 12:59:20.804 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: getManufacturer: DJI
2022-05-18 12:59:20.813 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: hasPermission 
2022-05-18 12:59:20.814 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: openAccessory: UsbAccessory[mManufacturer=DJI, mModel=com.dji.logiclink, mDescription=DJI RC-N1, mVersion=de, mUri=www.dji.com, mSerial=4TVCJ7T0150E94]
2022-05-18 12:59:20.843 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: mFileDescriptor: mInputStream=java.io.FileInputStream@d92eb93
2022-05-18 12:59:20.844 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: mFileDescriptor: FileDescriptor=true
2022-05-18 12:59:20.847 8057-8211/com.dji.sdk.sample E/linkDeamon: stopDaemon AOA
2022-05-18 12:59:20.851 8057-8957/com.dji.sdk.sample I/System.out: CommonThreadPool#9 calls detatch()
2022-05-18 12:59:20.851 8057-8211/com.dji.sdk.sample E/gfd: djisocket destroy
2022-05-18 12:59:20.851 8057-8957/com.dji.sdk.sample I/System.out: CommonThreadPool#9 calls detatch()
2022-05-18 12:59:20.855 8057-8211/com.dji.sdk.sample E/daemon: destroy wifi 1
2022-05-18 12:59:20.856 8057-8211/com.dji.sdk.sample E/fdd: djisocket destroy
2022-05-18 12:59:20.859 8057-8211/com.dji.sdk.sample E/daemon: destroy wifi 2
2022-05-18 12:59:20.864 8057-8211/com.dji.sdk.sample E/nhf: udt destroy 1 9000
2022-05-18 12:59:20.865 8057-8211/com.dji.sdk.sample E/nhf: udt destroy 2 9000
2022-05-18 12:59:20.866 8057-8211/com.dji.sdk.sample E/daemon: destroy wifi 3
2022-05-18 12:59:20.879 8057-8211/com.dji.sdk.sample E/P3CCameraService: udt destroy 1 9001
2022-05-18 12:59:20.879 8057-8554/com.dji.sdk.sample D/NFZ JNI: jni_sdk_initialize
2022-05-18 12:59:20.880 8057-8211/com.dji.sdk.sample E/P3CCameraService: udt destroy 2 9001
2022-05-18 12:59:20.880 8057-8211/com.dji.sdk.sample E/daemon: destroy wifi 4
2022-05-18 12:59:20.882 8057-8211/com.dji.sdk.sample E/SwUdpService: sw udt destroy 1 N/A
2022-05-18 12:59:20.886 8057-8211/com.dji.sdk.sample E/UDT-JNI: cannot close udp
2022-05-18 12:59:20.887 8057-8211/com.dji.sdk.sample E/SwUdpService: sw udt destroy 2 N/A
2022-05-18 12:59:20.887 8057-8211/com.dji.sdk.sample E/daemon: destroy wifi 5
2022-05-18 12:59:20.887 8057-8211/com.dji.sdk.sample E/nhf: djisocket destroy
2022-05-18 12:59:20.888 8057-8211/com.dji.sdk.sample E/daemon: destroy wifi 6
2022-05-18 12:59:20.898 8057-8211/com.dji.sdk.sample E/fdd: djisocket destroy
2022-05-18 12:59:20.899 8057-8211/com.dji.sdk.sample E/daemon: destroy wifi 7
2022-05-18 12:59:20.945 8057-8072/com.dji.sdk.sample I/zygote64: Background concurrent copying GC freed 165456(8MB) AllocSpace objects, 22(2MB) LOS objects, 45% free, 29MB/53MB, paused 3.806ms total 178.007ms
2022-05-18 12:59:20.969 8057-8672/com.dji.sdk.sample E/DJIPackManager: pack senderType=6 cmdSet=6
2022-05-18 12:59:20.976 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: check accessory handler
2022-05-18 12:59:21.002 8057-8948/com.dji.sdk.sample I/System.out: CommonThreadPool#8 calls detatch()
2022-05-18 12:59:21.009 8057-8585/com.dji.sdk.sample I/System.out: Thread-496872(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:21.009 8057-8585/com.dji.sdk.sample I/System.out: Thread-496872(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:21.009 8057-8585/com.dji.sdk.sample I/System.out: Thread-496872(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:21.009 8057-8585/com.dji.sdk.sample I/System.out: Thread-496872(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:21.009 8057-8585/com.dji.sdk.sample I/System.out: Thread-496872(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:21.015 8057-8672/com.dji.sdk.sample E/DJIPackManager: post DataCameraEvent.ConnectOK RC
2022-05-18 12:59:21.015 8057-8211/com.dji.sdk.sample E/DJIUSBWifiSwitchManager: ****resetSwitchFromWifiFlag
2022-05-18 12:59:21.064 8057-8554/com.dji.sdk.sample D/NFZ JNI: jni_sdk_initialize----> finished
2022-05-18 12:59:21.135 8057-8066/com.dji.sdk.sample I/zygote64: Do full code cache collection, code=251KB, data=159KB
2022-05-18 12:59:21.166 8057-8066/com.dji.sdk.sample I/zygote64: After code cache collection, code=179KB, data=92KB
2022-05-18 12:59:21.231 8057-8585/com.dji.sdk.sample I/System.out: CommonThreadPool#1 calls detatch()
2022-05-18 12:59:21.300 8057-8554/com.dji.sdk.sample E/FR_JNI: JNI_OnLoad
2022-05-18 12:59:21.317 8057-8585/com.dji.sdk.sample I/System.out: CommonThreadPool#1 calls detatch()
2022-05-18 12:59:21.374 8057-8554/com.dji.sdk.sample D/ConnectivityManager: getMobileDataEnabled()+ subId=1
2022-05-18 12:59:21.381 8057-8554/com.dji.sdk.sample D/ConnectivityManager: getMobileDataEnabled()- subId=1 retVal=true
2022-05-18 12:59:21.396 8057-8554/com.dji.sdk.sample E/fdd: isWifiLink:false isWifiConnected:true isMobileDataEnabled:true
2022-05-18 12:59:21.554 8057-8554/com.dji.sdk.sample E/fdd: start checkForDisable
2022-05-18 12:59:21.555 8057-8554/com.dji.sdk.sample E/fdd: disabled, return
2022-05-18 12:59:21.568 8057-8057/com.dji.sdk.sample E/fdd: start checkForDisable
2022-05-18 12:59:21.569 8057-8057/com.dji.sdk.sample E/fdd: disabled, return
2022-05-18 12:59:21.609 8057-8555/com.dji.sdk.sample E/App registration: API Key successfully registered
2022-05-18 12:59:21.625 8057-8554/com.dji.sdk.sample I/System.out: (HTTPLog)-Static: isSBSettingEnabled false
2022-05-18 12:59:21.625 8057-8554/com.dji.sdk.sample I/System.out: (HTTPLog)-Static: isSBSettingEnabled false
2022-05-18 12:59:21.633 8057-8555/com.dji.sdk.sample V/com.dji.sdk.sample.internal.view.MainContent: API Key successfully registered
2022-05-18 12:59:21.648 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: setView = android.widget.LinearLayout{7895abb V.E...... ......I. 0,0-0,0} TM=true MM=false
2022-05-18 12:59:21.649 8057-8057/com.dji.sdk.sample V/Toast: Text: TDK  in android.widget.Toast$TN@6c2cbd8
2022-05-18 12:59:21.657 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: dispatchAttachedToWindow
2022-05-18 12:59:21.688 8057-8057/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 12:59:21.689 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: Relayout returned: old=[0,0][0,0] new=[278,1636][802,1752] result=0x7 surface={valid=true 542922063872} changed=true
2022-05-18 12:59:21.691 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: MSG_RESIZED_REPORT: frame=Rect(278, 1636 - 802, 1752) ci=Rect(0, 0 - 0, 0) vi=Rect(0, 0 - 0, 0) or=1
2022-05-18 12:59:21.870 8057-8925/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:21.870 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:21.871 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:21.873 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:21.873 8057-8925/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:21.922 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:21.940 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:21.941 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:21.942 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:21.942 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:22.140 8057-8926/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:22.140 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:22.141 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:22.141 8057-8926/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:22.141 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:22.142 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:22.142 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:22.142 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:22.145 8057-8926/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:23.262 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:23.441 8057-8857/com.dji.sdk.sample I/System.out: CommonThreadPool#5 calls detatch()
2022-05-18 12:59:23.528 8057-8926/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:23.533 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:23.534 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:23.535 8057-8926/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:23.543 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:23.569 8057-8925/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:23.570 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:23.572 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:23.572 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:23.572 8057-8925/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:23.648 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: dispatchDetachedFromWindow
2022-05-18 12:59:23.652 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'cad7711 Toast (client)' ~ Disposing input event receiver.
2022-05-18 12:59:23.652 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'cad7711 Toast (client)' ~NativeInputEventReceiver.
2022-05-18 12:59:23.666 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:23.689 8057-8894/com.dji.sdk.sample I/chatty: uid=10466(u0_a466) Thread-271 identical 2 lines
2022-05-18 12:59:23.695 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:24.038 8057-8555/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: onComponentChange key:CAMERA, oldComponent:null, newComponent:dji.internal.camera.fdd@7543863
2022-05-18 12:59:24.049 8057-9108/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:24.068 8057-9108/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:24.068 8057-9108/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:24.069 8057-9108/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:24.072 8057-9108/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:24.072 8057-9108/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:24.074 8057-9108/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:24.075 8057-9108/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:24.075 8057-9108/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:33.248 8057-8555/com.dji.sdk.sample D/ViewRootImpl@2cadb56[MainActivity]: dispatchDetachedFromWindow
2022-05-18 12:59:33.248 8057-8555/com.dji.sdk.sample D/InputEventReceiver: channel '18b630e com.dji.sdk.sample/com.dji.sdk.sample.internal.controller.MainActivity (client)' ~ Disposing input event receiver.
2022-05-18 12:59:33.248 8057-8555/com.dji.sdk.sample D/InputEventReceiver: channel '18b630e com.dji.sdk.sample/com.dji.sdk.sample.internal.controller.MainActivity (client)' ~NativeInputEventReceiver.
2022-05-18 12:59:33.272 8057-8555/com.dji.sdk.sample E/ViewRootImpl: sendUserActionEvent() returned.
2022-05-18 12:59:33.274 8057-8057/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: MSG_WINDOW_FOCUS_CHANGED 1

2022-05-18 12:59:14.459 8057-8057/com.dji.sdk.sample I/MultiDex: Installing application
2022-05-18 12:59:14.459 8057-8057/com.dji.sdk.sample I/MultiDex: VM has multidex support, MultiDex support library is disabled.
2022-05-18 12:59:14.843 8057-8057/com.dji.sdk.sample I/FirebaseInitProvider: FirebaseApp initialization unsuccessful
2022-05-18 12:59:15.314 8057-8057/com.dji.sdk.sample V/com.dji.sdk.sample.internal.view.MainContent: initUI
2022-05-18 12:59:15.461 8057-8066/com.dji.sdk.sample I/zygote64: Do partial code cache collection, code=27KB, data=29KB
2022-05-18 12:59:15.462 8057-8066/com.dji.sdk.sample I/zygote64: After code cache collection, code=27KB, data=29KB
2022-05-18 12:59:15.462 8057-8066/com.dji.sdk.sample I/zygote64: Increasing code cache capacity to 128KB
2022-05-18 12:59:15.482 8057-8066/com.dji.sdk.sample I/zygote64: Do partial code cache collection, code=31KB, data=60KB
2022-05-18 12:59:15.484 8057-8066/com.dji.sdk.sample I/zygote64: After code cache collection, code=31KB, data=60KB
2022-05-18 12:59:15.484 8057-8066/com.dji.sdk.sample I/zygote64: Increasing code cache capacity to 256KB
2022-05-18 12:59:15.559 8057-8072/com.dji.sdk.sample I/zygote64: Background concurrent copying GC freed 11288(1008KB) AllocSpace objects, 0(0B) LOS objects, 49% free, 2MB/4MB, paused 310us total 113.087ms
2022-05-18 12:59:15.606 8057-8057/com.dji.sdk.sample I/IP:: 192.168.123.86
2022-05-18 12:59:15.609 8057-8057/com.dji.sdk.sample I/WebServer: Start WebServer 192.168.123.86:8888
2022-05-18 12:59:15.694 8057-8224/com.dji.sdk.sample D/OpenGLRenderer: HWUI GL Pipeline
2022-05-18 12:59:15.709 8057-8057/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: setView = DecorView@b495fbb[MainActivity] TM=true MM=false
2022-05-18 12:59:15.723 8057-8057/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: Comes into the onAttachedToWindow
2022-05-18 12:59:15.724 8057-8057/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: mProduct: null
2022-05-18 12:59:15.740 8057-8057/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: dispatchAttachedToWindow
2022-05-18 12:59:15.798 8057-8057/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 12:59:15.799 8057-8057/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: Relayout returned: old=[0,0][0,0] new=[0,0][1080,1920] result=0x7 surface={valid=true 543470612480} changed=true
2022-05-18 12:59:16.685 8057-8057/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: MSG_RESIZED_REPORT: frame=Rect(0, 0 - 1080, 1920) ci=Rect(0, 63 - 0, 0) vi=Rect(0, 63 - 0, 0) or=1
2022-05-18 12:59:16.686 8057-8057/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: MSG_WINDOW_FOCUS_CHANGED 1
2022-05-18 12:59:18.045 8057-8523/com.dji.sdk.sample E/DJISDKManager: Failed to load LDM Plus license file /storage/emulated/0/DJI/com.dji.sdk.sample.dlf (No such file or directory)
2022-05-18 12:59:18.101 8057-8554/com.dji.sdk.sample D/NetworkSecurityConfig: No Network Security Config specified, using platform default
2022-05-18 12:59:18.726 8057-8554/com.dji.sdk.sample W/System.err: java.lang.NoSuchMethodException: getInstance []
2022-05-18 12:59:18.726 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Class.getMethod(Class.java:2068)
2022-05-18 12:59:18.726 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Class.getMethod(Class.java:1690)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.nhf.getDataBaseInstRefl(Unknown Source:14)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK$CmdIdType.<init>(Unknown Source:12)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK$CmdIdType.<clinit>(Unknown Source:252)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK$CmdIdType.getValues(Unknown Source:0)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK.fdd(Unknown Source:0)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.fdd.<init>(Unknown Source:10)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdIdPayloadSDK.<init>(Unknown Source:0)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.config.P3.CmdSet.<clinit>(Unknown Source:762)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.nhf.<init>(Unknown Source:97)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.hjn.<init>(Unknown Source:35)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.DJIVideoPackManager.<init>(Unknown Source:1)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.DJIVideoPackManager.getInstance(Unknown Source:9)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.link.fdd.gfd(Unknown Source:36)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.link.fdd.<init>(Unknown Source:10)
2022-05-18 12:59:18.727 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.link.fdd.getInstance(Unknown Source:9)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.data.manager.P3.ServiceManager.ddf(Unknown Source:30)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.dgh.fdd(Unknown Source:27)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.fdd.fdd(Unknown Source:6)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initParams(Unknown Source:15)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initSDKManager(Unknown Source:12)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.registerApp(Unknown Source:37)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.access$1000(Unknown Source:0)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8$1.onDownloadSuccess(Unknown Source:8)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.internal.jhg.fdd.fdd(Unknown Source:19)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8.run(Unknown Source:37)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.dgh.gfd$fdd.run(Unknown Source:5)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:18.728 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:18.729 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:18.893 8057-8554/com.dji.sdk.sample E/DJIComponentManager: Service Not Connected
2022-05-18 12:59:19.237 8057-8554/com.dji.sdk.sample D/CertificatePolicyCache: Creating new instance of CertificatePolicyCache myUid: 10466 callingUid: 10466
2022-05-18 12:59:19.237 8057-8554/com.dji.sdk.sample D/CertificatePolicyCache: readVariables type: null userId: 0
2022-05-18 12:59:19.722 8057-8554/com.dji.sdk.sample D/UPGRADE_JNI: Upgrade SDK JNI_OnLoad---------------->
2022-05-18 12:59:19.728 8057-8554/com.dji.sdk.sample D/UPGRADE_JNI: Upgrade SDK JNI_OnLoad----------------> finished
2022-05-18 12:59:19.838 8057-8554/com.dji.sdk.sample W/System.err: javax.crypto.IllegalBlockSizeException: last block incomplete in decryption
2022-05-18 12:59:19.839 8057-8554/com.dji.sdk.sample W/System.err:     at com.android.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineDoFinal(BaseBlockCipher.java:1143)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at javax.crypto.Cipher.doFinal(Cipher.java:1736)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.encryption.util.AES256Encryption.decrypt(Unknown Source:31)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:7)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:8)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:2)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:2)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeLogicAdapter.fdd(Unknown Source:4)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeAdapterManager.nhf(Unknown Source:9)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.dgh.fdd.fdd(Unknown Source:11)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.gfd.fdd(Unknown Source:28)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initParams(Unknown Source:24)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initSDKManager(Unknown Source:12)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.registerApp(Unknown Source:37)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.access$1000(Unknown Source:0)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8$1.onDownloadSuccess(Unknown Source:8)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.internal.jhg.fdd.fdd(Unknown Source:19)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8.run(Unknown Source:37)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.dgh.gfd$fdd.run(Unknown Source:5)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:19.840 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err: javax.crypto.IllegalBlockSizeException: last block incomplete in decryption
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at com.android.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineDoFinal(BaseBlockCipher.java:1143)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at javax.crypto.Cipher.doFinal(Cipher.java:1736)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at dji.midware.encryption.util.AES256Encryption.decrypt(Unknown Source:31)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:7)
2022-05-18 12:59:19.842 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:8)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.gfd(Unknown Source:8)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeCacheDeviceLogic.fdd(Unknown Source:2)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeLogicAdapter.fdd(Unknown Source:4)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.upgradeadapter.UpgradeAdapterManager.nhf(Unknown Source:9)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.dgh.fdd.fdd(Unknown Source:11)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at nhf.hgf.dgh.gfd.fdd(Unknown Source:28)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initParams(Unknown Source:24)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.initSDKManager(Unknown Source:12)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.registerApp(Unknown Source:37)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager.access$1000(Unknown Source:0)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8$1.onDownloadSuccess(Unknown Source:8)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.internal.jhg.fdd.fdd(Unknown Source:19)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdk.sdkmanager.DJISDKManager$8.run(Unknown Source:37)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at dji.sdksharedlib.dgh.gfd$fdd.run(Unknown Source:5)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:19.843 8057-8554/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:19.925 8057-8211/com.dji.sdk.sample E/DJIComponentManager: Service Not Connected
2022-05-18 12:59:19.926 8057-8211/com.dji.sdk.sample I/chatty: uid=10466(u0_a466) dji_background_ identical 1 line
2022-05-18 12:59:19.926 8057-8211/com.dji.sdk.sample E/DJIComponentManager: Service Not Connected
2022-05-18 12:59:19.997 8057-8057/com.dji.sdk.sample D/ViewRootImpl@429f914[Toast]: dispatchDetachedFromWindow
2022-05-18 12:59:20.000 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'ef30393 Toast (client)' ~ Disposing input event receiver.
2022-05-18 12:59:20.001 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'ef30393 Toast (client)' ~NativeInputEventReceiver.
2022-05-18 12:59:20.363 8057-8857/com.dji.sdk.sample I/System.out: CommonThreadPool#5 calls detatch()
2022-05-18 12:59:20.390 8057-8925/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:20.393 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:20.393 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:20.393 8057-8925/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:20.394 8057-8925/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:20.417 8057-8948/com.dji.sdk.sample I/System.out: Thread-496950(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:20.464 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:20.465 8057-8957/com.dji.sdk.sample I/System.out: Thread-496952(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:20.710 8057-8948/com.dji.sdk.sample I/System.out: CommonThreadPool#8 calls detatch()
2022-05-18 12:59:20.721 8057-8554/com.dji.sdk.sample D/NFZ JNI: FS SDK JNI_OnLoad---------------->
2022-05-18 12:59:20.730 8057-8554/com.dji.sdk.sample D/NFZ JNI: FS SDK JNI_OnLoad----------------> finished
2022-05-18 12:59:20.798 8057-8926/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:20.799 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:20.799 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:20.799 8057-8926/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:20.800 8057-8926/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:20.803 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: getModel: com.dji.logiclink
2022-05-18 12:59:20.804 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: currentModel saved: LOGIC_LINK
2022-05-18 12:59:20.804 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: getManufacturer: DJI
2022-05-18 12:59:20.813 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: hasPermission 
2022-05-18 12:59:20.814 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: openAccessory: UsbAccessory[mManufacturer=DJI, mModel=com.dji.logiclink, mDescription=DJI RC-N1, mVersion=de, mUri=www.dji.com, mSerial=4TVCJ7T0150E94]
2022-05-18 12:59:20.843 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: mFileDescriptor: mInputStream=java.io.FileInputStream@d92eb93
2022-05-18 12:59:20.844 8057-8211/com.dji.sdk.sample E/DJIUsbAccessoryReceiver: mFileDescriptor: FileDescriptor=true
2022-05-18 12:59:20.847 8057-8211/com.dji.sdk.sample E/linkDeamon: stopDaemon AOA
2022-05-18 12:59:21.609 8057-8555/com.dji.sdk.sample E/App registration: API Key successfully registered
2022-05-18 12:59:21.625 8057-8554/com.dji.sdk.sample I/System.out: (HTTPLog)-Static: isSBSettingEnabled false
2022-05-18 12:59:21.625 8057-8554/com.dji.sdk.sample I/System.out: (HTTPLog)-Static: isSBSettingEnabled false
2022-05-18 12:59:21.633 8057-8555/com.dji.sdk.sample V/com.dji.sdk.sample.internal.view.MainContent: API Key successfully registered
2022-05-18 12:59:21.648 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: setView = android.widget.LinearLayout{7895abb V.E...... ......I. 0,0-0,0} TM=true MM=false
2022-05-18 12:59:21.649 8057-8057/com.dji.sdk.sample V/Toast: Text: TDK  in android.widget.Toast$TN@6c2cbd8
2022-05-18 12:59:21.657 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: dispatchAttachedToWindow
2022-05-18 12:59:21.688 8057-8057/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 12:59:21.689 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: Relayout returned: old=[0,0][0,0] new=[278,1636][802,1752] result=0x7 surface={valid=true 542922063872} changed=true
2022-05-18 12:59:21.691 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: MSG_RESIZED_REPORT: frame=Rect(278, 1636 - 802, 1752) ci=Rect(0, 0 - 0, 0) vi=Rect(0, 0 - 0, 0) or=1
2022-05-18 12:59:21.870 8057-8925/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:21.870 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:21.871 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:21.872 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:21.873 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:21.873 8057-8925/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:21.922 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:21.940 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:21.941 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:21.942 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:21.942 8057-8914/com.dji.sdk.sample I/System.out: Thread-496936(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:22.140 8057-8926/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:22.140 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:22.141 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:22.141 8057-8926/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:22.141 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:22.142 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:22.142 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:22.142 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:22.145 8057-8926/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:22.180 8057-8914/com.dji.sdk.sample I/System.out: CommonThreadPool#7 calls detatch()
2022-05-18 12:59:22.578 8057-8066/com.dji.sdk.sample I/zygote64: Do partial code cache collection, code=249KB, data=179KB
2022-05-18 12:59:22.579 8057-8066/com.dji.sdk.sample I/zygote64: After code cache collection, code=249KB, data=179KB
2022-05-18 12:59:22.579 8057-8066/com.dji.sdk.sample I/zygote64: Increasing code cache capacity to 1024KB
2022-05-18 12:59:22.729 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):isSBSettingEnabled false
2022-05-18 12:59:22.730 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):isShipBuild true
2022-05-18 12:59:22.766 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):getDebugLevel 0x4f4c
2022-05-18 12:59:22.766 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):Smart Bonding Setting is false
2022-05-18 12:59:22.766 8057-8857/com.dji.sdk.sample I/System.out: Thread-496927(ApacheHTTPLog):SmartBonding Setting is false, SHIP_BUILD is true, log to file is false, DBG is false, DEBUG_LEVEL (1-LOW, 2-MID, 3-HIGH) is 1
2022-05-18 12:59:22.860 8057-8211/com.dji.sdk.sample E/DJISDKCacheKeys: repeat include key, please check your code : class dji.sdksharedlib.hardware.abstractions.hjn.koy.ddf, key : @dji.sdksharedlib.keycatalog.ghj.koy(accessType=8, autoGetInterval=1000, excludedAbstractions=[class dji.sdksharedlib.hardware.abstractions.hjn.uio.dgh, class dji.sdksharedlib.hardware.abstractions.hjn.koy.ghu], expirationDuration=100, includedAbstractions=[class dji.sdksharedlib.hardware.abstractions.camera.zenmuse.hjn, class dji.sdksharedlib.hardware.abstractions.camera.zenmuse.nbb, class dji.sdksharedlib.hardware.abstractions.camera.zenmuse.hgf, class dji.sdksharedlib.hardware.abstractions.camera.zenmuse.jhg, class dji.sdksharedlib.hardware.abstractions.camera.zenmuse.bcx, class dji.sdksharedlib.hardware.abstractions.camera.zenmuse.oyf, class dji.sdksharedlib.hardware.abstractions.hjn.uio.fdd, class dji.sdksharedlib.hardware.abstractions.camera.zenmuse.fdd, class dji.sdksharedlib.hardware.abstractions.hjn.koy.ddf, class dji.sdksharedlib.hardware.abstractions.hjn.xss.dgh, class dji.sdksharedlib.hardware.abstractions.hjn.xss.uio, class dji.sdksharedlib.hardware.abstractions.hjn.jhg.nhf, class dji.sdksharedlib.hardware.abstractions.hjn.koy.ddf], protectDuration=500, type=class java.lang.Object, types=[class dji.common.camera.SettingsDefinitions$ZoomDirection, class dji.common.camera.SettingsDefinitions$ZoomSpeed], updateType=USER_DRIVEN)
2022-05-18 12:59:22.886 8057-8554/com.dji.sdk.sample I/onLoad: loaded onLoad.cpp :JNI_OnLoad() go to end --> upgrade verify
2022-05-18 12:59:23.147 8057-8211/com.dji.sdk.sample E/fdd: runMethod: null
2022-05-18 12:59:23.262 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:23.441 8057-8857/com.dji.sdk.sample I/System.out: CommonThreadPool#5 calls detatch()
2022-05-18 12:59:23.528 8057-8926/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:23.533 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:23.534 8057-8926/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:23.535 8057-8926/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:23.543 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:23.544 8057-8926/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:23.569 8057-8925/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:23.570 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:23.571 8057-8925/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:23.572 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:23.572 8057-8925/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:23.572 8057-8925/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:23.648 8057-8057/com.dji.sdk.sample D/ViewRootImpl@7151b4a[Toast]: dispatchDetachedFromWindow
2022-05-18 12:59:23.652 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'cad7711 Toast (client)' ~ Disposing input event receiver.
2022-05-18 12:59:23.652 8057-8057/com.dji.sdk.sample D/InputEventReceiver: channel 'cad7711 Toast (client)' ~NativeInputEventReceiver.
2022-05-18 12:59:23.666 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:23.689 8057-8894/com.dji.sdk.sample I/chatty: uid=10466(u0_a466) Thread-1088 identical 2 lines
2022-05-18 12:59:23.695 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:24.038 8057-8555/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: onComponentChange key:CAMERA, oldComponent:null, newComponent:dji.internal.camera.fdd@7543863
2022-05-18 12:59:24.049 8057-9108/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 12:59:24.068 8057-9108/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 12:59:24.068 8057-9108/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 12:59:24.069 8057-9108/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 12:59:24.072 8057-9108/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 12:59:24.072 8057-9108/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 12:59:24.074 8057-9108/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 12:59:24.075 8057-9108/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 12:59:24.075 8057-9108/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 12:59:24.116 8057-8057/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: mProduct: null
2022-05-18 12:59:24.119 8057-8555/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: onComponentChange key:GIMBAL, oldComponent:null, newComponent:dji.sdk.gimbal.koy@174fe51
2022-05-18 12:59:24.176 8057-8057/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: mProduct: null
2022-05-18 12:59:24.199 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:24.203 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1
2022-05-18 12:59:24.203 8057-8555/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: onComponentChange key:FLIGHT_CONTROLLER, oldComponent:null, newComponent:dji.sdk.flightcontroller.uio@dcdf5f2
2022-05-18 12:59:24.205 8057-8894/com.dji.sdk.sample E/firmUpgrade-CSDK: [upgrade module][multi image] req size: 1


2022-05-18 13:45:07.029 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64: Rejecting re-init on previously-failed class java.lang.Class<dji.internal.diagnostics.ddf$$Lambda$1>: java.lang.NoClassDefFoundError: Failed resolution of: Lcom/vividsolutions/jts/util/CollectionUtil$Function;
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.base.BaseProduct.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.products.Aircraft.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onIsOsmoChange(dji.sdksharedlib.store.DJISDKCacheParamValue) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onEvent3MainThread(dji.sdksharedlib.gfd.fdd$ddd) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Object java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[]) (Method.java:-2)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.invokeSubscriber(org.greenrobot.eventbus.Subscription, java.lang.Object) (:485)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postToSubscription(org.greenrobot.eventbus.Subscription, java.lang.Object, boolean) (:429)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at boolean org.greenrobot.eventbus.EventBus.postSingleEventForEventType(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState, java.lang.Class) (:397)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postSingleEvent(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState) (:370)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.post(java.lang.Object) (:251)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdksharedlib.gfd.fdd$xss.run() ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.handleCallback(android.os.Message) (Handler.java:789)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.dispatchMessage(android.os.Message) (Handler.java:98)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Looper.loop() (Looper.java:164)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.HandlerThread.run() (HandlerThread.java:65)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64: Caused by: java.lang.ClassNotFoundException: Didn't find class "com.vividsolutions.jts.util.CollectionUtil$Function" on path: DexPathList[[zip file "/data/user/0/com.dji.sdk.sample/.cache_sdk/sdkclasses2.jar", zip file "/data/user/0/com.dji.sdk.sample/.cache_sdk/sdkclasses.jar", zip file "/data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/base.apk"],nativeLibraryDirectories=[/data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/lib/arm64, /data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/base.apk!/lib/arm64-v8a, /system/lib64, /system/vendor/lib64]]
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class dalvik.system.BaseDexClassLoader.findClass(java.lang.String) (BaseDexClassLoader.java:93)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class java.lang.ClassLoader.loadClass(java.lang.String, boolean) (ClassLoader.java:379)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class java.lang.ClassLoader.loadClass(java.lang.String) (ClassLoader.java:312)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.base.BaseProduct.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.products.Aircraft.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onIsOsmoChange(dji.sdksharedlib.store.DJISDKCacheParamValue) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onEvent3MainThread(dji.sdksharedlib.gfd.fdd$ddd) ((null):-1)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Object java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[]) (Method.java:-2)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.invokeSubscriber(org.greenrobot.eventbus.Subscription, java.lang.Object) (:485)
2022-05-18 13:45:07.036 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postToSubscription(org.greenrobot.eventbus.Subscription, java.lang.Object, boolean) (:429)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at boolean org.greenrobot.eventbus.EventBus.postSingleEventForEventType(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState, java.lang.Class) (:397)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postSingleEvent(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState) (:370)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.post(java.lang.Object) (:251)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdksharedlib.gfd.fdd$xss.run() ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.handleCallback(android.os.Message) (Handler.java:789)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.dispatchMessage(android.os.Message) (Handler.java:98)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Looper.loop() (Looper.java:164)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.HandlerThread.run() (HandlerThread.java:65)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64: 
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64: Rejecting re-init on previously-failed class java.lang.Class<dji.internal.diagnostics.ddf$$Lambda$1>: java.lang.NoClassDefFoundError: Failed resolution of: Lcom/vividsolutions/jts/util/CollectionUtil$Function;
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.base.BaseProduct.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.products.Aircraft.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onIsOsmoChange(dji.sdksharedlib.store.DJISDKCacheParamValue) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onEvent3MainThread(dji.sdksharedlib.gfd.fdd$ddd) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Object java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[]) (Method.java:-2)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.invokeSubscriber(org.greenrobot.eventbus.Subscription, java.lang.Object) (:485)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postToSubscription(org.greenrobot.eventbus.Subscription, java.lang.Object, boolean) (:429)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at boolean org.greenrobot.eventbus.EventBus.postSingleEventForEventType(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState, java.lang.Class) (:397)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postSingleEvent(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState) (:370)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.post(java.lang.Object) (:251)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdksharedlib.gfd.fdd$xss.run() ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.handleCallback(android.os.Message) (Handler.java:789)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.dispatchMessage(android.os.Message) (Handler.java:98)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Looper.loop() (Looper.java:164)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.HandlerThread.run() (HandlerThread.java:65)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64: Caused by: java.lang.ClassNotFoundException: Didn't find class "com.vividsolutions.jts.util.CollectionUtil$Function" on path: DexPathList[[zip file "/data/user/0/com.dji.sdk.sample/.cache_sdk/sdkclasses2.jar", zip file "/data/user/0/com.dji.sdk.sample/.cache_sdk/sdkclasses.jar", zip file "/data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/base.apk"],nativeLibraryDirectories=[/data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/lib/arm64, /data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/base.apk!/lib/arm64-v8a, /system/lib64, /system/vendor/lib64]]
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class dalvik.system.BaseDexClassLoader.findClass(java.lang.String) (BaseDexClassLoader.java:93)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class java.lang.ClassLoader.loadClass(java.lang.String, boolean) (ClassLoader.java:379)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class java.lang.ClassLoader.loadClass(java.lang.String) (ClassLoader.java:312)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.base.BaseProduct.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.products.Aircraft.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onIsOsmoChange(dji.sdksharedlib.store.DJISDKCacheParamValue) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onEvent3MainThread(dji.sdksharedlib.gfd.fdd$ddd) ((null):-1)
2022-05-18 13:45:07.037 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Object java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[]) (Method.java:-2)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.invokeSubscriber(org.greenrobot.eventbus.Subscription, java.lang.Object) (:485)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postToSubscription(org.greenrobot.eventbus.Subscription, java.lang.Object, boolean) (:429)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at boolean org.greenrobot.eventbus.EventBus.postSingleEventForEventType(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState, java.lang.Class) (:397)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postSingleEvent(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState) (:370)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.post(java.lang.Object) (:251)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdksharedlib.gfd.fdd$xss.run() ((null):-1)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.handleCallback(android.os.Message) (Handler.java:789)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.dispatchMessage(android.os.Message) (Handler.java:98)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Looper.loop() (Looper.java:164)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.HandlerThread.run() (HandlerThread.java:65)
2022-05-18 13:45:07.038 16014-16062/com.dji.sdk.sample I/zygote64: 
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64: Rejecting re-init on previously-failed class java.lang.Class<dji.internal.diagnostics.ddf$$Lambda$1>: java.lang.NoClassDefFoundError: Failed resolution of: Lcom/vividsolutions/jts/util/CollectionUtil$Function;
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.base.BaseProduct.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.products.Aircraft.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onIsOsmoChange(dji.sdksharedlib.store.DJISDKCacheParamValue) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onEvent3MainThread(dji.sdksharedlib.gfd.fdd$ddd) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Object java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[]) (Method.java:-2)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.invokeSubscriber(org.greenrobot.eventbus.Subscription, java.lang.Object) (:485)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postToSubscription(org.greenrobot.eventbus.Subscription, java.lang.Object, boolean) (:429)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at boolean org.greenrobot.eventbus.EventBus.postSingleEventForEventType(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState, java.lang.Class) (:397)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postSingleEvent(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState) (:370)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.post(java.lang.Object) (:251)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdksharedlib.gfd.fdd$xss.run() ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.handleCallback(android.os.Message) (Handler.java:789)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.dispatchMessage(android.os.Message) (Handler.java:98)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Looper.loop() (Looper.java:164)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.HandlerThread.run() (HandlerThread.java:65)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64: Caused by: java.lang.ClassNotFoundException: Didn't find class "com.vividsolutions.jts.util.CollectionUtil$Function" on path: DexPathList[[zip file "/data/user/0/com.dji.sdk.sample/.cache_sdk/sdkclasses2.jar", zip file "/data/user/0/com.dji.sdk.sample/.cache_sdk/sdkclasses.jar", zip file "/data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/base.apk"],nativeLibraryDirectories=[/data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/lib/arm64, /data/app/com.dji.sdk.sample--EOZ_AQX5Se-Nccdg1GiOA==/base.apk!/lib/arm64-v8a, /system/lib64, /system/vendor/lib64]]
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class dalvik.system.BaseDexClassLoader.findClass(java.lang.String) (BaseDexClassLoader.java:93)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class java.lang.ClassLoader.loadClass(java.lang.String, boolean) (ClassLoader.java:379)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Class java.lang.ClassLoader.loadClass(java.lang.String) (ClassLoader.java:312)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.base.BaseProduct.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.products.Aircraft.<init>(dji.sdk.sdkmanager.DJISDKManager$SDKManagerCallback) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onIsOsmoChange(dji.sdksharedlib.store.DJISDKCacheParamValue) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdk.sdkmanager.DJISDKManager.onEvent3MainThread(dji.sdksharedlib.gfd.fdd$ddd) ((null):-1)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at java.lang.Object java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[]) (Method.java:-2)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.invokeSubscriber(org.greenrobot.eventbus.Subscription, java.lang.Object) (:485)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postToSubscription(org.greenrobot.eventbus.Subscription, java.lang.Object, boolean) (:429)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at boolean org.greenrobot.eventbus.EventBus.postSingleEventForEventType(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState, java.lang.Class) (:397)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.postSingleEvent(java.lang.Object, org.greenrobot.eventbus.EventBus$PostingThreadState) (:370)
2022-05-18 13:45:07.040 16014-16062/com.dji.sdk.sample I/zygote64:     at void org.greenrobot.eventbus.EventBus.post(java.lang.Object) (:251)
2022-05-18 13:45:07.041 16014-16062/com.dji.sdk.sample I/zygote64:     at void dji.sdksharedlib.gfd.fdd$xss.run() ((null):-1)
2022-05-18 13:45:07.041 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.handleCallback(android.os.Message) (Handler.java:789)
2022-05-18 13:45:07.041 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Handler.dispatchMessage(android.os.Message) (Handler.java:98)
2022-05-18 13:45:07.041 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.Looper.loop() (Looper.java:164)
2022-05-18 13:45:07.041 16014-16062/com.dji.sdk.sample I/zygote64:     at void android.os.HandlerThread.run() (HandlerThread.java:65)
2022-05-18 13:45:07.041 16014-16062/com.dji.sdk.sample I/zygote64: 
2022-05-18 13:45:07.076 16014-17101/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: onProductConnect newProduct:WM161
2022-05-18 13:45:07.091 16014-16014/com.dji.sdk.sample D/com.dji.sdk.sample.internal.view.MainContent: mProduct: unnull
2022-05-18 13:45:07.169 16014-17194/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.169 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.170 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.170 16014-17194/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.170 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.170 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.170 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.170 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.171 16014-17194/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.176 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.234 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.234 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.235 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.235 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.235 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.235 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.235 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.236 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.236 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.244 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.277 16014-17328/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.278 16014-17328/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.278 16014-17328/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.278 16014-17328/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.278 16014-17328/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.279 16014-17328/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.279 16014-17328/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.280 16014-17328/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.280 16014-17328/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.287 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.489 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.490 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.490 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.492 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.493 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.494 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.495 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.495 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.496 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.496 16014-17194/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.496 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.497 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.497 16014-17194/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.497 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.497 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.498 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.498 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.498 16014-17194/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.519 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.530 16014-17195/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.531 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.531 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.531 16014-17195/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.532 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.532 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.532 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.532 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.533 16014-17195/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.569 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.607 16014-17343/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.607 16014-17343/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.607 16014-17343/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.608 16014-17343/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.608 16014-17343/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.608 16014-17343/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.608 16014-17343/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.608 16014-17343/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.608 16014-17343/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.615 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.634 16014-16020/com.dji.sdk.sample I/zygote64: Do full code cache collection, code=502KB, data=342KB
2022-05-18 13:45:07.637 16014-16020/com.dji.sdk.sample I/zygote64: After code cache collection, code=480KB, data=255KB
2022-05-18 13:45:07.728 16014-17194/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.729 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.729 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.729 16014-17194/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.729 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.729 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.730 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.730 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.730 16014-17194/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.744 16014-17328/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.745 16014-17328/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.745 16014-17328/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.745 16014-17328/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.745 16014-17328/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.746 16014-17328/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.746 16014-17328/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.746 16014-17328/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.747 16014-17328/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.758 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.769 16014-17327/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.769 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.770 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.770 16014-17327/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.770 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.770 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.770 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.770 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.770 16014-17327/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.774 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.774 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.774 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.775 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.775 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.775 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.775 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.775 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.776 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.778 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.793 16014-17185/com.dji.sdk.sample E/firmUpgrade-CSDK: [server mgr] 00 InternalFetchVersionConfigInfo result : 1
2022-05-18 13:45:07.816 16014-17195/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.816 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.816 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.816 16014-17195/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.816 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.817 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.817 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.817 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.817 16014-17195/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.943 16014-17343/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.944 16014-17343/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.945 16014-17343/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.945 16014-17343/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.945 16014-17343/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.945 16014-17343/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.946 16014-17343/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.946 16014-17343/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.946 16014-17343/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:07.974 16014-17328/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:07.975 16014-17328/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.001 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.002 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.002 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.007 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.007 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.007 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.008 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.008 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.008 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.009 16014-16062/com.dji.sdk.sample E/fdd: receive msg MSG_RETRY_DETECT_ENABLE_TIMEOUT
2022-05-18 13:45:08.073 16014-17327/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.073 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.073 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.073 16014-17327/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.074 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.074 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.074 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.075 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.075 16014-17327/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.260 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.261 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.261 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.261 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.261 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.262 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.265 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.265 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.267 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.293 16014-17327/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.293 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.293 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.294 16014-17327/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.294 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.294 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.294 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.295 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.295 16014-17327/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.323 16014-17194/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.323 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.327 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.327 16014-17194/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.327 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.328 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.328 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.328 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.328 16014-17194/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.495 16014-16026/com.dji.sdk.sample I/zygote64: Background concurrent copying GC freed 334637(21MB) AllocSpace objects, 18(352KB) LOS objects, 36% free, 42MB/66MB, paused 643us total 130.657ms
2022-05-18 13:45:08.509 16014-17195/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.509 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.509 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.510 16014-17195/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.510 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.510 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.510 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.510 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.510 16014-17195/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.534 16014-17327/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.534 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.535 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.535 16014-17327/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.535 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.535 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.536 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.536 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.536 16014-17327/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.539 16014-16020/com.dji.sdk.sample I/zygote64: Do partial code cache collection, code=483KB, data=274KB
2022-05-18 13:45:08.543 16014-16020/com.dji.sdk.sample I/zygote64: After code cache collection, code=483KB, data=274KB
2022-05-18 13:45:08.543 16014-16020/com.dji.sdk.sample I/zygote64: Increasing code cache capacity to 2MB
2022-05-18 13:45:08.765 16014-17195/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.766 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.766 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.766 16014-17195/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.766 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.766 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.767 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.767 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.767 16014-17195/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.842 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.843 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.843 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.843 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.844 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.844 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.845 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.845 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.845 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:08.910 16014-17194/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:08.910 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:08.911 16014-17194/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:08.911 16014-17194/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:08.911 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:08.911 16014-17194/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:08.912 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:08.912 16014-17194/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:08.913 16014-17194/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.085 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:09.086 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.087 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.087 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.088 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.088 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.089 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.089 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.090 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.113 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.113 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.113 16014-17327/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.114 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.115 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.116 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.117 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.118 16014-17327/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.339 16014-17195/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:09.340 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.340 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.340 16014-17195/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.341 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.341 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.341 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.342 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.342 16014-17195/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.361 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:09.362 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.363 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.363 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.363 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.363 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.364 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.365 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.365 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.484 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: ViewPostIme pointer 0
2022-05-18 13:45:09.586 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: ViewPostIme pointer 1
2022-05-18 13:45:09.587 16014-17325/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:09.587 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.587 16014-17325/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.587 16014-17325/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.588 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.588 16014-17325/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.588 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.588 16014-17325/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.588 16014-17325/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.700 16014-17327/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:09.700 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.700 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.701 16014-17327/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.701 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.701 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.702 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.702 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.703 16014-17327/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.884 16014-16014/com.dji.sdk.sample D/AbsListView:  in onLayout changed 
2022-05-18 13:45:09.894 16014-16020/com.dji.sdk.sample I/zygote64: Compiler allocated 9MB to compile void android.widget.TextView.<init>(android.content.Context, android.util.AttributeSet, int, int)
2022-05-18 13:45:09.956 16014-17327/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:09.957 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.957 16014-17327/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.957 16014-17327/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.957 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.958 16014-17327/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.958 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.958 16014-17327/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.960 16014-17327/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:09.961 16014-17195/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:09.961 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:09.961 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:09.961 16014-17195/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:09.964 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:09.965 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:09.965 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:09.965 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:09.965 16014-17195/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:10.003 16014-16020/com.dji.sdk.sample I/zygote64: Compiler allocated 9MB to compile void android.widget.TextView.<init>(android.content.Context, android.util.AttributeSet, int, int)
2022-05-18 13:45:10.554 16014-17195/com.dji.sdk.sample W/System.err: org.json.JSONException: No value for content-type
2022-05-18 13:45:10.555 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.get(JSONObject.java:392)
2022-05-18 13:45:10.555 16014-17195/com.dji.sdk.sample W/System.err:     at org.json.JSONObject.getString(JSONObject.java:553)
2022-05-18 13:45:10.556 16014-17195/com.dji.sdk.sample W/System.err:     at dji.upgrade.internal.csdk.commonadapter.network.NetworkAdapter$fdd.onResponse(Unknown Source:106)
2022-05-18 13:45:10.556 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.RealCall$AsyncCall.execute(Unknown Source:48)
2022-05-18 13:45:10.556 16014-17195/com.dji.sdk.sample W/System.err:     at dji.thirdparty.okhttp3.internal.NamedRunnable.run(Unknown Source:17)
2022-05-18 13:45:10.557 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
2022-05-18 13:45:10.557 16014-17195/com.dji.sdk.sample W/System.err:     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
2022-05-18 13:45:10.557 16014-17195/com.dji.sdk.sample W/System.err:     at java.lang.Thread.run(Thread.java:764)
2022-05-18 13:45:12.804 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: ViewPostIme pointer 0
2022-05-18 13:45:12.879 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: ViewPostIme pointer 1
2022-05-18 13:45:12.973 16014-16020/com.dji.sdk.sample I/zygote64: Compiler allocated 4MB to compile void android.view.View.<init>(android.content.Context, android.util.AttributeSet, int, int)
2022-05-18 13:45:13.067 16014-16014/com.dji.sdk.sample D/SurfaceView: BG hide() Surface(name=Background for - SurfaceView - com.dji.sdk.sample/com.dji.sdk.sample.internal.controller.MainActivity@81ec8c8@0) false true com.dji.sdk.sample.internal.utils.OnScreenJoystick{81ec8c8 V.E...... ......ID 26,1343-367,1684 #7f090104 app:id/directionJoystickRight}
2022-05-18 13:45:13.092 16014-16014/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 13:45:13.092 16014-16014/com.dji.sdk.sample D/SurfaceView: surfaceCreated 1 com.dji.sdk.sample.internal.utils.OnScreenJoystick{81ec8c8 V.E...... ......ID 26,1343-367,1684 #7f090104 app:id/directionJoystickRight}
2022-05-18 13:45:13.093 16014-16014/com.dji.sdk.sample D/SurfaceView: surfaceChanged (341,341) 1 com.dji.sdk.sample.internal.utils.OnScreenJoystick{81ec8c8 V.E...... ......ID 26,1343-367,1684 #7f090104 app:id/directionJoystickRight}
2022-05-18 13:45:13.099 16014-16014/com.dji.sdk.sample D/SurfaceView: BG hide() Surface(name=Background for - SurfaceView - com.dji.sdk.sample/com.dji.sdk.sample.internal.controller.MainActivity@8f89d61@0) false true com.dji.sdk.sample.internal.utils.OnScreenJoystick{8f89d61 V.E...... ......ID 713,1343-1054,1684 #7f090103 app:id/directionJoystickLeft}
2022-05-18 13:45:13.109 16014-16014/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 13:45:13.109 16014-16014/com.dji.sdk.sample D/SurfaceView: surfaceCreated 1 com.dji.sdk.sample.internal.utils.OnScreenJoystick{8f89d61 V.E...... ......ID 713,1343-1054,1684 #7f090103 app:id/directionJoystickLeft}
2022-05-18 13:45:13.110 16014-16014/com.dji.sdk.sample D/SurfaceView: surfaceChanged (341,341) 1 com.dji.sdk.sample.internal.utils.OnScreenJoystick{8f89d61 V.E...... ......ID 713,1343-1054,1684 #7f090103 app:id/directionJoystickLeft}
2022-05-18 13:45:13.153 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: Relayout returned: old=[0,0][1080,1920] new=[0,0][1080,1920] result=0x1 surface={valid=true 543470612480} changed=false
2022-05-18 13:45:18.963 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: ViewPostIme pointer 0
2022-05-18 13:45:19.054 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: ViewPostIme pointer 1
2022-05-18 13:45:19.181 16014-17101/com.dji.sdk.sample D/ScrollView: initGoToTop
2022-05-18 13:45:19.219 16014-17101/com.dji.sdk.sample D/ViewRootImpl@9133d32[MainActivity]: setView = DecorView@827a83[] TM=true MM=false
2022-05-18 13:45:19.233 16014-17101/com.dji.sdk.sample D/ViewRootImpl@9133d32[MainActivity]: dispatchAttachedToWindow
2022-05-18 13:45:19.274 16014-17101/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 13:45:19.274 16014-17101/com.dji.sdk.sample D/ViewRootImpl@9133d32[MainActivity]: Relayout returned: old=[0,0][0,0] new=[384,833][696,1150] result=0x7 surface={valid=true 543252836352} changed=true
2022-05-18 13:45:19.279 16014-16067/com.dji.sdk.sample D/mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000,  [312x317]-format:1
2022-05-18 13:45:19.279 16014-16067/com.dji.sdk.sample D/OpenGLRenderer: eglCreateWindowSurface = 0x7e4a7714e0
2022-05-18 13:45:19.281 16014-17101/com.dji.sdk.sample D/ScrollView:  onsize change changed 
2022-05-18 13:45:19.282 16014-17101/com.dji.sdk.sample D/ViewRootImpl@9133d32[MainActivity]: MSG_WINDOW_FOCUS_CHANGED 1
2022-05-18 13:45:19.296 16014-17101/com.dji.sdk.sample D/ViewRootImpl@2e83bdf[Toast]: setView = android.widget.LinearLayout{c99a02c V.E...... ......I. 0,0-0,0} TM=true MM=false
2022-05-18 13:45:19.296 16014-17101/com.dji.sdk.sample V/Toast: Text: ZawC in android.widget.Toast$TN@a3ecaf5
2022-05-18 13:45:19.319 16014-17101/com.dji.sdk.sample D/ViewRootImpl@2e83bdf[Toast]: dispatchAttachedToWindow
2022-05-18 13:45:19.368 16014-17101/com.dji.sdk.sample V/Surface: sf_framedrop debug : 0x4f4c, game : false, logging : 0
2022-05-18 13:45:19.369 16014-17101/com.dji.sdk.sample D/ViewRootImpl@2e83bdf[Toast]: Relayout returned: old=[0,0][0,0] new=[186,1050][894,1752] result=0x27 surface={valid=true 543252840448} changed=true
2022-05-18 13:45:19.377 16014-16014/com.dji.sdk.sample D/ViewRootImpl@36e144a[MainActivity]: MSG_WINDOW_FOCUS_CHANGED 0
2022-05-18 13:45:19.379 16014-17101/com.dji.sdk.sample D/ViewRootImpl@9133d32[MainActivity]: MSG_RESIZED_REPORT: frame=Rect(384, 833 - 696, 1150) ci=Rect(0, 0 - 0, 0) vi=Rect(0, 0 - 0, 0) or=1
2022-05-18 13:45:19.382 16014-17101/com.dji.sdk.sample D/ViewRootImpl@2e83bdf[Toast]: MSG_RESIZED_REPORT: frame=Rect(186, 1050 - 894, 1752) ci=Rect(0, 0 - 0, 0) vi=Rect(0, 0 - 0, 0) or=1
2022-05-18 13:45:19.433 16014-16026/com.dji.sdk.sample I/zygote64: Background concurrent copying GC freed 448649(15MB) AllocSpace objects, 3(300KB) LOS objects, 28% free, 61MB/85MB, paused 839us total 190.119ms
2022-05-18 13:45:19.585 16014-16020/com.dji.sdk.sample I/zygote64: Compiler allocated 4MB to compile boolean com.dji.service.areacode.koy.fdd.fdd(java.lang.String)
2022-05-18 13:45:20.661 16014-16020/com.dji.sdk.sample I/zygote64: Compiler allocated 8MB to compile void android.view.ViewRootImpl.performTraversals()
2022-05-18 13:45:21.239 16014-17101/com.dji.sdk.sample D/ViewRootImpl@2e83bdf[Toast]: dispatchDetachedFromWindow
2022-05-18 13:45:21.245 16014-17101/com.dji.sdk.sample D/InputEventReceiver: channel 'd25fbb Toast (client)' ~ Disposing input event receiver.
2022-05-18 13:45:21.245 16014-17101/com.dji.sdk.sample D/InputEventReceiver: channel 'd25fbb Toast (client)' ~NativeInputEventReceiver.

```