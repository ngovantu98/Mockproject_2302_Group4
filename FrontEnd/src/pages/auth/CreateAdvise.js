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
//import UserApi from '../../api/UserApi';
import AdviseApi from '../../api/AdviseApi';
import { useState } from "react";
import { withRouter } from "react-router-dom";

const CreateAdvise = (props) => {

  const [isOpenModal, setOpenModal] = useState(false);

  const [email, setEmail] = useState("");
   const [isDisabledResendEmailButton, setDisabledResendEmailButton] = useState(false);

  
  return (
    <>
      <div className="text-center mt-4">
        <h1 className="h2">Quý khách vui lòng nhập thông tin bên dưới, chúng tôi sẽ liên hệ lại sau ít phút</h1>
      </div>

      <Formik
        initialValues={
          {
            name: '',
            phone: '',
            email: '',
            information: '',
            
            
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
              await AdviseApi.create(
                values.name,
                values.email,
                values.phone,
                values.information,
                
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
                      label="Họ tên"
                      bsSize="lg"
                      type="text"
                      name="name"
                      placeholder="Nhập họ tên của Quý khách"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* Lastname */}
                  <FormGroup>
                    <FastField
                      label="Email"
                      bsSize="lg"
                      type="text"
                      name="email"
                      placeholder="Nhập email của Quý khách"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* username */}
                  <FormGroup>
                    <FastField
                      label="Số điện thoại"
                      bsSize="lg"
                      type="text"
                      name="phone"
                      placeholder="Nhập số điện thoại"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* email */}
                  <FormGroup>
                    <FastField
                      label="Thông tin cần tư vấn"
                      bsSize="lg"
                      type="text"
                      name="information"
                      placeholder="Nhập thông tin"
                      component={ReactstrapInput}
                    />
                  </FormGroup>
                  <ErrorMessage name="errorForm" component={"div"} className="invalid-feedback" style={{ display: "block" }} />

                  {/* submit */}
                  <div className="text-center mt-3">
                    <Button type="submit" color="primary" size="lg" disabled={isSubmitting}>
                      Gửi yêu cầu
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
        Chúng tôi đã tiếp nhận yêu cầu thành công
        </ModalHeader>

        {/* body */}
        <ModalBody className="m-3">
          <p>
            Chúng tôi sẽ thông tin đến quý khách trong một vài phút tới
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

export default withRouter(CreateAdvise);
