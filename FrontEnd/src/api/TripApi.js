import Api from './Api';

const url = "/trips";
const url1 = "/tours";



const getAll = () => {
    return Api.get(`${url}`);
};
// const getAll = (page, size, sortField, sortType, search, minTotalMember, maxTotalMember) => {

//     // default parameters
//     if (sortField === null || sortField === undefined || sortType === null || sortType === undefined) {
//         sortField = "id";
//         sortType = "desc";
//     }

//     const requestParams = {
//         page,
//         size,
//         sort: `${sortField},${sortType}`,
//         search,
//         minTotalMember,
//         maxTotalMember
//     }

//     if (minTotalMember) {
//         requestParams.minTotalMember = minTotalMember;
//     }

//     if (maxTotalMember) {
//         requestParams.maxTotalMember = maxTotalMember;
//     }

//     return Api.get(url, { params: requestParams });
// };

const existsByName = (name) => {
    return Api.get(`${url}/name/${name}`);
};

const create = (name,schedule,tripImage1,tripImage2,tripImage3,tripImage4,tourId) => {
    const body = {
        name,
        schedule,
        tripImage1,
        tripImage2,
        tripImage3,
        tripImage4,
        tourId

    };

    return Api.post(url, body);
};

const getByID = (id) => {
    console.log(id);
    return Api.get(`${url1}/${id}`);
};

const update = (id, name, totalMember) => {
    const body = {
        name,
        totalMember
    }
    return Api.put(`${url}/${id}`, body);
};

const deleteByIds = (ids) => {
    return Api.delete(`${url}/${ids.toString()}`);
};

// export
const api = { getAll, existsByName, create, update, getByID, deleteByIds }
export default api;