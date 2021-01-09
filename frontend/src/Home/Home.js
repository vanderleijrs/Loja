import React, {useState} from 'react';
import {Button, Form} from 'react-bootstrap'
import CardComponent from '../components/Card/Card'
import CadastroCompra from '../components/CadastroCompra/CadastroCompra'
import Modal from '../components/Modal/Modal'
export default function Home() {
   {/* const json;*/}
   const [isModalVisible, setIsModalVisible] = useState(false);
   const handleBudgetClick = () => setIsModalVisible(!isModalVisible);
        return (
            <div className='container'><br/>
                <CardComponent title="Cadastro de Cliente">
                <h1>Sistema de finanças</h1><br/>
                <Form>
                  <Form.Group>
                    <Form.Control type="text" placeholder="Nome Cliente" />
                  </Form.Group>
                    {/*<Button className="btn btn-primary btn-lg" href="/CadastroCompra" onClick={CadastroCompra} style={{marginLeft:10}}>Cadastrar Cliente</Button>*/}
                    <Button className="btn btn-primary btn-lg" onClick={handleBudgetClick}style={{marginLeft:10}}>Cadastrar compra </Button>
                    <Modal isModalVisible={isModalVisible} handleBudgetClick={handleBudgetClick} />
                    <Button className="btn btn-primary btn-lg" href="#/Table" style={{marginLeft:10}}> Procurar Clientes</Button>
                </Form>
                </CardComponent>
               
            </div>
        )
}