import * as types from "../constants";

export function getListTourAction(tour) {
  return {
    type: types.GET_LIST_TOUR,
    payload:tour
  };
}