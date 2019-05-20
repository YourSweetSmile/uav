package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Route;

public class RouteHelper extends Route {

    private Route route;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public RouteHelper() {
    }

    public RouteHelper(Route route) {
        this.route = route;
    }
}
