angular.module('demo', [])
.controller('DepartureInfo', function($scope, $http) {
    $http.get('http://localhost:8080/getDepartureTime?stopTag=5205').
        then(function(response) {
            $scope.departureInfo = response.data;
        });
});