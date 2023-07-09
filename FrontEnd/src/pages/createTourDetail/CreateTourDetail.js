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
import TripApi from '../../api/TripApi';
import { useState } from "react";
import { withRouter } from "react-router-dom";
import { CKEditor } from '@ckeditor/ckeditor5-react';
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';

const CreateTourDetail = (props) => {

  var schedule;

  const [isOpenModal, setOpenModal] = useState(false);

  const [email, setEmail] = useState("");
   const [isDisabledResendEmailButton, setDisabledResendEmailButton] = useState(false);

  
  return (
    <>
      <div className="text-center mt-4">
        <h1 className="h2">Create Tour Detail</h1>
      </div>

      <Formik
        initialValues={
          {
            name: '',
            schedule: '',
            pointDeparture: '',
            tripImage1: '',
            tripImage2: '',
            tripImage3: '',
            tripImage4: '',
            tourId: ''
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
              await TripApi.create(
                values.name,
                schedule,
                values.tripImage1,
                values.tripImage2,
                values.tripImage3,
                values.tripImage4,
                values.tourId,
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
                      label="Tên"
                      bsSize="lg"
                      type="text"
                      name="name"
                      placeholder="Nhập tên"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* Lastname */}
                  <FormGroup>
                    <FastField
                      label="Lịch trình"
                      bsSize="lg"
                      type="text"
                      name="schedule"
                      placeholder="Nhập lịch trình"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* username */}
                  <FormGroup>
                    <FastField
                      label="Ảnh mô tả 1"
                      bsSize="lg"
                      type="text"
                      name="tripImage1"
                      placeholder="Nhập ảnh mô tả 1"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* email */}
                  <FormGroup>
                    <FastField
                      label="Ảnh mô tả 2"
                      bsSize="lg"
                      type="text"
                      name="tripImage2"
                      placeholder="Nhập ảnh mô tả 2"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* password */}
                  <FormGroup>
                    <FastField
                      label="Ảnh mô tả 3"
                      bsSize="lg"
                      type="text"
                      name="tripImage3"
                      placeholder="Nhập ảnh mô tả 3"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  {/* confirm password */}
                  <FormGroup>
                    <FastField
                      label="Ảnh mô tả 4"
                      bsSize="lg"
                      type="text"
                      name="tripImage4"
                      placeholder="Nhập ảnh mô tả 4"
                      component={ReactstrapInput}
                    />
                  </FormGroup>

                  <FormGroup>
                    <FastField
                      label="tourId"
                      bsSize="lg"
                      type="text"
                      name="tourId"
                      placeholder="Nhập tourId"
                      component={ReactstrapInput}
                    />
                  </FormGroup>
                  
                  <div style={{ height: 300}}>
                    <CKEditor
                      editor={ ClassicEditor }
                      data="<p>Hello from CKEditor 5!</p>"
                      onReady={ editor => {
                          // You can store the "editor" and use when it is needed.
                          console.log( 'Editor is ready to use!', editor );
                      } }
                      onChange={ ( event, editor ) => {
                          const data = editor.getData();
                          schedule= data;
                          console.log( { event, editor, data } );
                      } }
                      onBlur={ ( event, editor ) => {
                          console.log( 'Blur.', editor );
                      } }
                      onFocus={ ( event, editor ) => {
                          console.log( 'Focus.', editor );
                      } }
                  />
                </div>

                  {/* <ErrorMessage name="errorForm" component={"div"} className="invalid-feedback" style={{ display: "block" }} /> */}

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
          Tạo Trip
        </ModalHeader>

        {/* body */}
        <ModalBody className="m-3">
          <p>
            Đã tạo Trip thành công.
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

export default withRouter(CreateTourDetail);
