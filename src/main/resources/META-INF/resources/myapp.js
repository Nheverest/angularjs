var app = angular.module('myapp', []);
app.controller('HelloWorldController', function($scope, $http){
    $scope.variable = "AngularJS Property Read Test";
    $scope.IpValue = "n.a.";
    $scope.ServerResponse = "n.a.";

    $scope.checkServerAccess = function(ip) {
        $http.get('http://' + ip + ':8080/rest/hello').then(
        function success(response) {
            $scope.ServerResponse = response.data;
        },
        function error(response) {
            $scope.ServerResponse = response.status;
        })
    };

    $http.get('rest/server').then(
        function success(response) {
            $scope.IpValue = response.data.ip;
            console.log('Server response is ', response.data);
            $scope.checkServerAccess(response.data.ip);
          },
        function error(response) {
            console.log("error: " + response.status);
        }
    )});

