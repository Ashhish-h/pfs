import React, { useState } from "react";
import axios from 'axios';
export default function LoginPage() {

    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')

    const handleSubmit = async (e) => {
        e.preventDefault();

        //api call


        console.log(email, password)

        const data = {
            "email": email,
            "password": password,
        }

        try {
            const response = await axios.post('http://localhost:8081/login', data)

            if (response.data) {
                console.log('login success', response.data)
                alert('login success')
            } else {
                console.log('login fails', response.data)
                alert('Invalid email or passowrd')
            }
        } catch (error) {
            console.log(error)
        }

    }

    return (
        <div>
            <h2>Login page</h2>
            <form action="" onSubmit={handleSubmit} >
                <div>
                    <label htmlFor="email">Email: </label>
                    <input type="email" id="email" name="email" value={email} onChange={(e) => setEmail(e.target.value)} />
                </div>
                <div>
                    <label htmlFor="password">Password: </label>
                    <input type="password" id="password" name="password" value={password} onChange={(e) => setPassword(e.target.value)} />
                </div>
                <button type="submit">Login</button>
            </form>
        </div>
    )
}