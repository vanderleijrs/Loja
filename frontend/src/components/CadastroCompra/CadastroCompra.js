import React from 'react'
import {Form,Button} from 'react-bootstrap'
import CardComponent from '../Card/Card'

class CadastroCompra extends React.Component {
    render(){   
        return(
            <div className='container'><br/>
                <CardComponent title="Cadastro da Compra!">
                    <div>
                    <Form.Group>
                        <Form.Control size="lg" type="text" placeholder="Descrição" /><br/>
                        <div className="container" style={{textAlign:"right"}}>
                        <Button variant="primary">Add compra</Button>
                        </div>
                    </Form.Group>
                    </div>
                </CardComponent>
            </div>
        )
    }
}
export default CadastroCompra