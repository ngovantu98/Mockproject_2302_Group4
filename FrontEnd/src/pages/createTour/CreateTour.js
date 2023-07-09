import React from "react";

import {
  Button,
  Card,
  CardBody,
  FormGroup,
  Modal,
  ModalBody,
  ModalFooter,
  ModalHeader
} from "reactstrap";
import { Formik, FastField, Form, ErrorMessage } from 'formik';
//import * as Yup from 'yup';
import { ReactstrapInput } from "reactstrap-formik";
import TourApi from '../../api/TourApi';
import { useState } from "react";
import { withRouter } from "react-router-dom";

const CreateTour = (props) => {

  const [isOpenModal, setOpenModal] = useState(false);

  const [email, setEmail] = useState("");
   const [isDisabledResendEmailButton, setDisabledResendEmailButton] = useState(false);

  
  return (
    <>
      <div className="text-center mt-4">
        <h1 className="h2">Create Tour</h1>
      </div>

      <Formik
        initialValues={
          {
            name: '',
            departureplace: '',
            describe: '',
            price: '',
            time: '',
            emptyseat: '',
            tourimage1: '',
            tourimage2: '',
            tourimage3: '',
            tourimage4: '',
            tourimage5: '',
            highLight: '',
          }
        }
        // validationSchema={
        //   Yup.object({
        //     firstname: Yup.string()
        //       .max(50, 'Must be less than 50 characters or equal')
        //       .required('Required'),

        //     lastname: Yup.string()
        //       .max(50, 'Must be less than 50 characters or equal')
        //       .required('Required'),

        //     username: Yup.string()
        //       .required('Required')
        //       .max(50, 'Must be between 6 to 50 characters')
        //       .min(6, 'Must be between 6 to 50 characters')
        //       .test('checkUniqueUsername', 'This username is already registered.', async username => {
        //         // call api
        //         const isExists = await UserApi.existsByUsername(username);
        //         return !isExists;
        //       }),

        //     email: Yup.string()
        //       .required('Required')
        //       .max(50, 'Must be between 6 to 50 characters')
        //       .min(6, 'Must be between 6 to 50 characters')
        //       .email('Invalid email address')
        //       .test('checkUniqueEmail', 'This email is already registered.', async email => {
        //         // call api
        //         const isExists = await UserApi.existsByEmail(email);
        //         return !isExists;
        //       }),

        //     password: Yup.string()
        //       .max(50, 'Must be between 6 to 50 characters')
        //       .min(6, 'Must be between 6 to 50 characters')
        //       .required('Required'),

        //     confirmpassword: Yup.string()
        //       .when("password", {
        //         is: value => (value && value.length > 0 ? true : false),
        //         then: Yup.string().oneOf(
        //           [Yup.ref("password")],
        //           "Both password need to be the same"
        //         )
        //       })
        //       .required('Required')
        //   })
        // }
        onSubmit={
          async (values, { setFieldError }) => {
            try {
              // call api
              await TourApi.create(
                values.name,
                values.departurePlace,
                values.describe,
                values.price,
                values.time,
                values.emptySeat,
                values.tourImage1,
                values.tourImage2,
                values.tourImage3,
                values.tourImage4,
                values.tourImage5,
                values.highLight
                );
              // open model 
              setOpenModal(true);
              setEmail(values.email);
            } catch (error) {
              setFieldError('errorForm', 'There is an error from the server');
              console.log(error);
            }
          }
        }
        validateOnChange={false}
        validateOnBlur={false}
      >
        {({ isSubmitting }) => (
          <Card>
            <CardBody>
              <div className="m-sm-4">
                <Form>
                  {/* Firstname */}
                  <FormGroup>
                    <FastField
                      label="Tên Tour"
                      bsSize="lg"
                      type="text"
                      name="name"
                      placeholder="Nhập tên Tour"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* Lastname */}
                  <FormGroup>
                    <FastField
                      label="Nơi khởi hành"
                      bsSize="lg"
                      type="text"
                      name="departurePlace"
                      placeholder="Nhập nơi khởi hành"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* username */}
                  <FormGroup>
                    <FastField
                      label="Mã Tour"
                      bsSize="lg"
                      type="text"
                      name="describe"
                      placeholder="Nhập mã Tour"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* email */}
                  <FormGroup>
                    <FastField
                      label="Giá"
                      bsSize="lg"
                      type="text"
                      name="price"
                      placeholder="Nhập giá Tour"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* password */}
                  <FormGroup>
                    <FastField
                      label="Thời gian"
                      bsSize="lg"
                      type="text"
                      name="time"
                      placeholder="Nhập thời gian"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* confirm password */}
                  <FormGroup>
                    <FastField
                      label="Số chỗ còn nhận"
                      bsSize="lg"
                      type="text"
                      name="emptySeat"
                      placeholder="Nhập số chỗ còn nhận"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  <FormGroup>
                    <FastField
                      label="Ảnh miêu tả 1"
                      bsSize="lg"
                      type="text"
                      name="tourImage1"
                      placeholder="Nhập địa chỉ ảnh miêu tả 1"
                      component={ReactstrapInput}
                    />
                  </FormGroup>
                  <FormGroup>
                    <FastField
                      label="Ảnh miêu tả 2"
                      bsSize="lg"
                      type="text"
                      name="tourImage2"
                      placeholder="Nhập địa chỉ ảnh miêu tả 2"
                      component={ReactstrapInput}
                    />
                  </FormGroup>
                  <FormGroup>
                    <FastField
                      label="Ảnh miêu tả 3"
                      bsSize="lg"
                      type="text"
                      name="tourImage3"
                      placeholder="Nhập địa chỉ ảnh miêu tả 3"
                      component={ReactstrapInput}
                    />
                  </FormGroup>
                  <FormGroup>
                    <FastField
                      label="Ảnh miêu tả 4"
                      bsSize="lg"
                      type="text"
                      name="tourImage4"
                      placeholder="Nhập địa chỉ ảnh miêu tả 4"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  <FormGroup>
                    <FastField
                      label="Ảnh miêu tả 5"
                      bsSize="lg"
                      type="text"
                      name="tourImage5"
                      placeholder="Nhập địa chỉ ảnh miêu tả 5"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  <FormGroup>
                    <FastField
                      label="Điểm nhấn Tour"
                      bsSize="lg"
                      type="text"
                      name="highLight"
                      placeholder="Nhập điểm nhấn"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  <ErrorMessage name="errorForm" component={"div"} className="invalid-feedback" style={{ display: "block" }} />

                  {/* submit */}
                  <div className="text-center mt-3">
                    <Button type="submit" color="primary" size="lg" disabled={isSubmitting}>
                      Tạo
                    </Button>
                  </div>

                </Form>
              </div>
            </CardBody>
          </Card>
        )}
      </Formik>

      <Modal
        isOpen={isOpenModal}
      >
        {/* header */}
        <ModalHeader>
          You need to confirm your account
        </ModalHeader>

        {/* body */}
        <ModalBody className="m-3">
          <p>
            Đã tạo Tour thành công.
          </p>
        </ModalBody>
        <ModalFooter>
        <a href="http://localhost:3000/tours">
                    <Button>
                      Đến trang chủ
                    </Button>
                  </a>
        </ModalFooter>

        {/* footer */}
        
      </Modal>
    </>
  )

};

export default withRouter(CreateTour);
