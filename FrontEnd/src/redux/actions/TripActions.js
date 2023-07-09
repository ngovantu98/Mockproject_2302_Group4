import * as types from "../constants";

export function getListTripAction(trip) {
  return {
    type: types.GET_LIST_TRIP,
    payload:trip
  };
}