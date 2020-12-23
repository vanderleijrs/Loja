import React from 'react'
import {withRouter} from 'react-router-dom'
import {Form,Button} from 'react-bootstrap'
import CardComponent from '../components/Card/CardComponent'
class CadastroUsuario extends React.Component{
    render(){
        return(
            <div className='container'><br/>
                <CardComponent title="Cadastro de Cliente">
                    <div>
                    <Form.Group>
                        <Form.Control size="lg" type="text" placeholder="Nome da Pessoa" /><br/>
                        <div className="container" style={{textAlign:"right"}}>
                        <Button variant="primary">Cadastrar</Button>{''}
                        </div>
                    </Form.Group>
                    </div>
                </CardComponent>
            </div>
        )
    }
}
export default withRouter(CadastroUsuario)