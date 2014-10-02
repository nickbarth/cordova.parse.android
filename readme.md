Cordova Parse Android Plugin
============================

## About this Plugin

Cordova Parse Plugin for Android.

## Using the Plugin

Example:

```
<script type="text/javascript">
  ParseAndroid.init(appId, clientKey, userToken, function() {
    alert('success');
  }, function(e) {
    alert('error');
  });
</script>
```

## Adding the Plugin ##

```
  cordova plugin add https://github.com/nickbarth/cordova.parse.android.git
```

## LICENSE ##

MIT &copy; 2014 Nick Barth
