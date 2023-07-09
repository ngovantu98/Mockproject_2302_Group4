import * as types from "../constants";

const initialState = {
  trips: []
  
};

export default function reducer(state = initialState, actions) {
  switch (actions.type) {
    case types.GET_LIST_TRIP:
      return {
        ...state,
        trips: actions.payload
      };
    default:
      return state;
  }
}