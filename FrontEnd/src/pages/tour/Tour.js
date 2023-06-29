import React, { useEffect } from "react";
import {
  Card,
  Button,
  CardBody,
  CardFooter,
  CardHeader,
  CardImg,
  CardText,
  CardTitle,
  Col,
  Container,
  Row,
} from "reactstrap";

import {selectTours} from "../../redux/selectors/TourSelector";
import {getListTourAction} from "../../redux/actions/TourActions";

import BootstrapTable from "react-bootstrap-table-next";
import paginationFactory from "react-bootstrap-table2-paginator";

import { connect } from "react-redux";
import TourApi from "../../api/TourApi";

import unsplash4 from "../../assets/img/photos/quynhon1.jpg";
import unsplash1 from "../../assets/img/photos/unsplash-1.jpg";
import unsplash2 from "../../assets/img/photos/unsplash-2.jpg";
//import unsplash3 from "../../assets/img/photos/unsplash-3.jpg";

const Tour = (props) => {
  const getListTour = props.getListTourAction;

  useEffect(() => {
    const getAllTour = async () => {
    const result = await TourApi.getAll();
    const tours = result.content;
    console.log(tours);
    getListTour(tours);
    }
    getAllTour();
  }, [getListTour]);

  return(
  <Container fluid className="p-0">
    <h1 class="tieude">Du lịch trong nước</h1>
    <div class="tieude2">
Du lịch trong nước luôn là lựa chọn tuyệt vời. Đường bờ biển dài hơn 3260km, những khu bảo tồn thiên nhiên tuyệt vời, những thành phố nhộn nhịp, những di tích lịch sử hào hùng, nền văn hóa độc đáo và hấp dẫn, cùng một danh sách dài những món ăn ngon nhất thế giới, Việt Nam có tất cả những điều đó. Với lịch trình dày, khởi hành đúng thời gian cam kết, Vietravel là công ty lữ hành uy tín nhất hiện nay tại Việt Nam, luôn sẵn sàng phục vụ du khách mọi lúc, mọi nơi, đảm bảo tính chuyên nghiệp và chất lượng dịch vụ tốt nhất thị trường
</div>
<br></br>
<br></br>
<h1 class="tieude3" itemprop="name">Tour nổi bật</h1>
<br></br>
    <Row>
        {props.tours && props.tours.map((tour, key) =>{
          const { name, time, price,departurePlace,tourImage,emptySeat,describe} = tour;
          return(
            <Col md="12" lg="4">
            <Card>
            <img class ="totourImage" alt="" src={tourImage}/>
            <CardHeader>
            <h1 class="time">{time}</h1>
              <CardTitle tag="h5" className="name">
              {name}
              </CardTitle>
              <p class="code-tour">Mã tour :  
            <span class="describe">{describe}</span></p>
            </CardHeader>
            <CardBody>
                
            <p class="tour-item">Nơi khởi hành :  
            <span class="departurePlace">{departurePlace}</span></p>
               <CardText  tag="h5" className="price">
                {price}
                </CardText>
                <br></br>
                <Button href="#" color="primary">
                 Xem chi tiết
                </Button>
               
            </CardBody>
            <CardFooter>
            <p class="tour-item3">Số chỗ còn nhận :
            <span class="emptySeat">{emptySeat}</span></p>
                
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
  return {
    tours: selectTours(state)
  };
};

export default connect(mapGlobalStateToProps, { getListTourAction })(Tour);

