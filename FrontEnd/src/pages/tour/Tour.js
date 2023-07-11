import React, { useEffect } from "react";
import {
  Card,
  Button,
  CardBody,
  CardFooter,
  CardHeader,
  CardText,
  CardTitle,
  Col,
  Container,
  Row,
} from "reactstrap";

import { selectTours } from "../../redux/selectors/TourSelector";
import { getListTourAction } from "../../redux/actions/TourActions";
import { connect } from "react-redux";
import TourApi from "../../api/TourApi";


const Tour = (props) => {
  const getListTour = props.getListTourAction;
  useEffect(() => {
    const getAllTour = async () => {
      const trips = await TourApi.getAll();
      console.log(trips);
      getListTour(trips);
    }
    getAllTour();
  }, [getListTour]);

  const goToTourDetail = (tourId) =>{
    props.history.push({
      pathname: '/trips',
      state: {tourId: tourId} // your data array of objects {key: value}
    })
  }

  return (
    <Container fluid className="p-0">
      <h1 className="tieude">Du lịch trong nước</h1>
      <div className="tieude2">
        Du lịch trong nước luôn là lựa chọn tuyệt vời. Đường bờ biển dài hơn 3260km, những khu bảo tồn thiên nhiên tuyệt vời, những thành phố nhộn nhịp, những di tích lịch sử hào hùng, nền văn hóa độc đáo và hấp dẫn, cùng một danh sách dài những món ăn ngon nhất thế giới, Việt Nam có tất cả những điều đó. Với lịch trình dày, khởi hành đúng thời gian cam kết, Vietravel là công ty lữ hành uy tín nhất hiện nay tại Việt Nam, luôn sẵn sàng phục vụ du khách mọi lúc, mọi nơi, đảm bảo tính chuyên nghiệp và chất lượng dịch vụ tốt nhất thị trường
      </div>
      <br></br>
      <br></br>
      <h1 className="tieude3" itemProp="name">Tour nổi bật</h1>
      <br></br>
      <Row>
        {props.tours && props.tours.map((tour, key) => {
          const { id,name, time, price1, departurePlace, tourImage1, emptySeat, describe } = tour;
          return (
            <Col md="12" lg="4">
              <Card>
                <img className="tourImage" alt="" src={tourImage1} />
                <CardHeader>
                  <h1 className="time">{time}</h1>
                  <CardTitle tag="h5" className="name">
                    {name}
                  </CardTitle>
                  <p className="code-tour">Mã tour :
                    <span className="describe">{describe}</span></p>
                </CardHeader>
                <CardBody>

                  <p className="tour-item">Nơi khởi hành :
                    <span className="departurePlace">{departurePlace}</span></p>
                  <CardText tag="h5" classNameName="price">
                    {price1}
                  </CardText>
                  
                  <br></br>                
                    <Button onClick={() => goToTourDetail(id)}>
                      Xem chi tiết
                    </Button>
                </CardBody>
                <CardFooter>
                  <p className="tour-item3">Số chỗ còn nhận :
                    <span className="emptySeat">{emptySeat}</span></p>
                </CardFooter>
              </Card>
            </Col>
          );
        })}
      </Row>
    </Container>
  )
};

const mapGlobalStateToProps = state => {
  console.log("LLLLL");
  console.log(state);
  return {
    tours: selectTours(state)
  };
};

export default connect(mapGlobalStateToProps, { getListTourAction })(Tour);

