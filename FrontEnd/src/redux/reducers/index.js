import { combineReducers } from "redux";

import sidebar from "./sidebarReducers";
import layout from "./layoutReducer";
import theme from "./themeReducer";
import userLoginInfo from "./userLoginInfoReducer";
import group from "./groupReducer";
import Tour from "./TourReducer";
import Trip from "./TripReducer";


import { reducer as toastr } from "react-redux-toastr";

export default combineReducers({
  sidebar,
  layout,
  theme,
  toastr,
  userLoginInfo,
  group,
  Tour,
  Trip,

});