import React, { useEffect } from "react";
import {
  Button,
  Card,
  CardBody,
  CardFooter,
  CardHeader,
  CardText,
  CardTitle,
  Col,
  Container,
  Row,

} from "reactstrap";
import { selectTrips } from "../../redux/selectors/TripSelector ";
import { getListTripAction } from "../../redux/actions/TripActions";
import { connect } from "react-redux";
import TripApi from "../../api/TripApi";
import * as Icon from "react-feather";
import { useLocation } from "react-router-dom";

const Trip = (props) => {
  const location = useLocation();
  const getTrip = props.getListTripAction;
  useEffect(() => {
    const tourId = location.state.tourId;
    const getTripById = async () => {
      console.log(tourId);
      const result = await TripApi.getByID(tourId);
      console.log("1111111");
      getTrip(result);
    }
    getTripById();
  }, [getTrip]);




  return (
    <Container>
      <p class="title1">{props.trips.name}</p>
      <div class ="booking">
      <Icon.Code size="15" className="align-middle mr-2" />
      <label class="nd5">{props.trips.describe}</label>
      <div>
        <Button>Đặt ngay</Button>
      </div>
      <br></br>
      {/* <div class="booking">
        <Button>Liên hệ tư vấn</Button>
      </div> */}

      <a href="http://localhost:3000/auth/create-advise">
        <Button>
          Liên hệ tư vấn
        </Button>
      </a>
      </div>




      <div class="image-grid">
        <img class="image-grid-col-2 image-grid-row-2" src={props.trips.tourImage1} alt="" />
        <img src={props.trips.tourImage2} alt="" />
        <img src={props.trips.tourImage3} alt="" />
        <img src={props.trips.tourImage4} alt="" />
        <img src={props.trips.tourImage5} alt="" />
      </div>
      <br></br>
      <br></br>
      <br></br>
      <br></br>

      <div class="row">
        <div class="col-md-5 col-12 left">
          <p class="s-title-03 tour-des"></p>

          <hr></hr>
          <div class="box-order">

            <div class="time">
              <p class="nd1">Khởi hành: <b class="nd3">{props.trips.departureDay}</b></p>
              <p class="nd1">Thời gian: <b class="nd3">{props.trips.time}</b></p>
              <p class="nd1">Nơi khởi hành: <b class="nd3">{props.trips.departurePlace}</b></p>
              <p class="nd1">
                Số chỗ còn nhận: <b class="nd3">{props.trips.emptySeat}</b>
              </p>
            </div>
          </div>
          <hr></hr>
          <div class="box-support">
            <Icon.PhoneCall size="30" className="align-middle mr-2" />
            <label>Quý khách cần hỗ trợ?</label>
            <div class="group-contact">
              <a href="https://webcall.talking.vn/frame-click-to-call/new?code=tCEZl1-MKPuA6JU-czVAScCb0pPkHmPt" onclick="if (!window.__cfRLUnblockHandlers) return false; javascript:window.open(this.href,'targetWindow','toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=375,height=667');return false;" target="_blank" class="phone">
                <i class="icon icon--phone"></i>

                <p class="nd">Gọi miễn phí qua internet</p>
              </a>
              <a href="mailto:info@vietravel.com" class="mail">
                <i class="icon icon--mail"></i>
                <Icon.Mail size="30" className="align-middle mr-2" />
                <p class="nd">Gửi yêu cầu hỗ trợ ngay</p>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-7 col-12 right">
          <div class="group-services">
            <div class="item">
              <Icon.Clock size="24" className="align-middle mr-2" />
              <label class="nd">Thời gian:</label>
              <p class="nd2">3 ngày 2 đêm</p>
            </div>
            <div class="item">
              <Icon.Truck size="24" className="align-middle mr-2" />
              <label class="nd">Phương tiện di chuyển:</label>
              <p class="nd2"> Máy bay, Xe du lịch</p>
            </div>
            <div class="item">
              <Icon.Clock size="24" className="align-middle mr-2" />
              <label class="nd">Ẩm thực:</label>
              <p class="nd2">Buffet sáng, Theo thực đơn</p>
            </div>
            <div class="item">
              <Icon.Home size="24" className="align-middle mr-2" />
              <label class="nd">Khách sạn:</label>
              <p class="nd2">Khách sạn 4 sao</p>
            </div>
            <div class="item">
              <Icon.Grid size="24" className="align-middle mr-2" />
              <label class="nd">Thời gian lý tưởng:</label>
              <p class="nd2">Quanh năm</p>
            </div>
            <div class="item">
              <Icon.Users size="24" className="align-middle mr-2" />
              <label class="nd">Đối tượng thích hợp:</label>
              <p class="nd2">Cặp đôi, Gia đình nhiều thế hệ, Thanh niên</p>
            </div>
            <div class="item">
              <Icon.Bookmark size="24" className="align-middle mr-2" />
              <label class="nd">Ưu đãi:</label>
              <p class="nd2">Đã bao gồm trong giá tour</p>
            </div>
          </div>
        </div>
      </div>
      <br></br>
      <br></br>
      <p class="nd1">Điểm nhấn  :
        <span class="detailTour">{props.trips.highLight}</span></p>


      <hr></hr>
      <p className="title">Lịch trình</p>
      <div class="title2">
        {props.trips.listTrip && props.trips.listTrip.map((trip, key) => {
          const { name, schedule, tripImage2 } = trip;

          return (

            <h1 class="nd">
              
              {name}
              {schedule}
            </h1>
          );
        })}
      </div>
      <br></br>
      <br></br>
      <br></br>
      <br></br>
      <br></br>
      <div>

        <div class="price-table">
          <hr></hr>
          Giá tour và phụ thu phòng đơn

          <table class="styled-table">
            <thead>
              <tr>
                <th class="nd">Loại khách</th>
                <th class="nd">Giá tour</th>
              </tr>
            </thead>
            <tbody>
              <tr >
                <td class="nd">Người lớn(Từ 12 tuổi trở lên)</td>
                <td class="nd">{props.trips.price1}</td>
              </tr>
              <tr class="active-row">
                <td class="nd">Trẻ em(Từ 5 đến 11 tuổi)</td>
                <td class="nd">{props.trips.price2}</td>
              </tr>
              <tr>
                <td class="nd">Phụ thu phòng đơn </td>
                <td class="nd">1.300.000đ</td>
              </tr>

            </tbody>
          </table>
        </div>

        <div>
          <div class="price-table">
            <hr></hr>
            Thông tin hướng dẫn viên

            <table class="styled-table">
              <thead>
                <tr>
                  <th class="nd"></th>
                  <th class="nd">Họ tên</th>
                </tr>
              </thead>
              <tbody>
                <tr >
                  <td class="nd">Hướng dẫn viên dẫn đoàn :</td>
                  <td class="nd">{props.trips.tourManage}</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
      <hr></hr>


    </Container>
  );
};


const mapGlobalStateToProps = state => {
  console.log("LLLLL");
  console.log(state);

  return {
    trips: selectTrips(state),
  };
};

export default connect(mapGlobalStateToProps, { getListTripAction })(Trip);

