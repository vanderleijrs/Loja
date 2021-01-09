import React, { useState } from "react";
import {
    Button,
    Modal as BootstrapModal,
    ModalHeader,
    ModalBody,
    Row,
    Col,
    FormGroup,
    Label,
    Alert
} from "reactstrap";
import { Formik, Form, Field, ErrorMessage } from "formik";
import "./ModalStyle.css";
import { ERRORS } from "../../constant";
import InputMask from "react-input-mask";
import * as yup from "yup";
import Axios from "axios";
import { Dropdown, DropdownToggle, DropdownMenu, DropdownItem } from 'reactstrap';



function Modal(props) {
    const validationSchema = yup.object().shape({
        email: yup.string().email('e-mail inválido').required(ERRORS.REQUIRED_FIELD),
        fullName: yup.string().required(ERRORS.REQUIRED_FIELD),
        cep: yup.string().required(ERRORS.REQUIRED_FIELD),
        cellphone: yup.string().required(ERRORS.REQUIRED_FIELD),
        localDescription: yup.string(),
        residueDescription:yup.string(),

    });

    const [isAlertVisible, setIsAlertVisible] = useState(false);
    const handleAlertClick = () => setIsAlertVisible(!isAlertVisible);

    const [submitSuccess, setSubmitSuccess] = useState(false);
    const handleSubmitSuccess = (success) => setSubmitSuccess(success);



    const initialValues = {
        name: "",
        data: "",
        descricao: "",
        valorUnitario: 0.0,
        quantidade: 0,
        valorTotal:0.0,
    };
     let fieldText = false;
     let fieldTextResidue= false;
     let fieldTextFloor= false;
     let fieldTextQuantity=false;

    const onSubmit = (values, { setSubmitting, resetForm }) => {

        const requestCreateEstimate = {
            cliente: {
                name: values.name,

            },

            compra: {
                descricao: values.descricao,
                data: values.data,
                valorUnitario: values.valorUnitario,
                quantidade: values.quantidade,
                valorTotal: values.valorUnitario * values.quantidade,

            },


 }
        let BACKEND_URL = process.env.REACT_APP_IS_LOCAL_BACKEND
           "http://localhost:8080" ;
        setTimeout(() => {
                   console.log("URL backend: "+ BACKEND_URL)
                   Axios.post(`${BACKEND_URL}/estimate`,
                       requestCreateEstimate
                   ).then(function (response) {
                       console.log(JSON.stringify(values));
                       handleSubmitSuccess(true);
                       setSubmitting(false);
                   }).catch(function (error) {
                       console.error(error)
                       handleSubmitSuccess(false);
                   }).then(function () {
                       handleAlertClick();
                   });

        }, 400);
    };

     const showingField = (values) =>{
         if (fieldText === true){
            return (
            <div><Field
              maxLength="200"
              type="text"
              name="localDescription"
              value={values.localDescription}
              placeholder="Descreva..."
              className="form-control field-input"
              />
              <ErrorMessage component="div" name="localDescription" />
             </div> ) }else { return null;}
        };
      function fieldTextTrue() {
       fieldText === true ? fieldText = false : fieldText = true

      };
      const showingFieldFloor = (values) =>{
               if (fieldTextFloor === true){
                  return (
                  <div><Field
                    min="1"
                    max="4"
                    type="Number"
                    name="andar"
                    value={values.andar}
                    placeholder="Informe o andar"
                    className="form-control field-input"
                    />
                   </div> ) }else { return null;}
      };
      function fieldTextTrueFloor() {
             fieldTextFloor === true ? fieldTextFloor = false : fieldTextFloor = true

      };


      const showingFieldResidue = (values) =>{
        if (fieldTextResidue === true){
           return (
           <Row className="quant"><Field
             maxLength="200"
             type="text"
             name="residueDescription"
             value={values.residueDescription}
             placeholder="Descreva..."
             className="form-control field-input"
             />
             <ErrorMessage component="div" name="residueDescription" />
            </Row> ) }else { return null;}
       };
       function fieldTextTrueResidue(value) {
            if (value === "Outro:"){
                fieldTextResidue = true
            }else {
                fieldTextResidue = false
            }
        };

        const showingFieldQuantity = (values) =>{
            if (fieldTextQuantity === true){
               return (
               <div>
                </div> ) }else { return null;}
   };
   function fieldTextTrueQuantity() {
    fieldTextQuantity === true ? fieldTextQuantity = false : fieldTextQuantity = true

   };

    return (
        <BootstrapModal

            border="light"
            isOpen={props.isModalVisible}
            toggle={props.handleBudgetClick}
        >
            <ModalHeader toggle={props.handleBudgetClick}>
                Cadastre sua compra
            </ModalHeader>
            <ModalBody>
                <Formik
                    initialValues={initialValues}
                    validationSchema={validationSchema}
                    onSubmit={onSubmit}
                >
                    {({
                        values,
                        handleChange,
                        handleBlur,
                        isSubmitting,
                        isValid,
                    }) => (

                            <Form className="form-inputs-style">
                                    <Field
                                    name="fullName" required
                                    className="form-control field-input"
                                    placeholder="Nome do Cliente"
                                    onChange={handleChange}
                                    value={values.fullName}
                                    onBlur={handleBlur}/>
                                    <ErrorMessage component="div" name="fullName" />
                                <br />
                                <Button
                                    className="form-button"
                                    disabled={!isValid || isSubmitting}
                                    block
                                    color="secondary"
                                    type="submit">

                                    Solicitar
                            </Button>
                            <Alert color={submitSuccess ? "success" : "danger"} isOpen={isAlertVisible} toggle={handleAlertClick}>
                                    {

                                        submitSuccess ? "Sua solicitação foi enviada! Obrigada!" + values.locationInfo:
                                                        "Ops! Tivemos um problema. Tente novamente mais tarde. " + values.locationInfo
                                    }
                            </Alert>

                            </Form>
                        )}
                </Formik>
            </ModalBody>
        </BootstrapModal>
    );
}

export default Modal;
