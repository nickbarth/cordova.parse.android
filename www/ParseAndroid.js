var exec = require('cordova/exec');

var androidInit = function(appId, clientId, userToken, callback) {
  var androidInitReturn = function (json) {
    var data = JSON.parse(json);

    if (data.error)
      return callback(data.error, null);

    return callback(null, data);
  }

  exec(androidInitReturn, androidInitReturn, 'ParseInit', 'ParseInit', [appId, clientId, userToken]);
};

var ParseAndroid = {
  init: androidInit
};

module.exports = ParseAndroid;
