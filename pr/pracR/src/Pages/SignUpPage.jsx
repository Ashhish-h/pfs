import React from "react";
import { useState } from 'react'
import axios from "axios";

export default function SignUpPage() {

    const [formData, setFormData] = useState({
        name: '',
        email: '',
        password: '',
    })

    const handleInputChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value })
    }

    const handleSubmit = async (e) => {
        e.preventDefault()

        const data = {
            "name": formData.name,
            "email": formData.email,
            "password": formData.password
        }

        //api
        try {
            const response = await axios.post('http://localhost:8081/signup', data)
            if (response.data) {
                console.log("user add")
                alert('signup successfull')
            } else {
                console.log('user not added')
                alert('signup fails')
            }
        } catch (error) {
            console.log(error)
        }


    }

    return (
        <>
            <div className="signup-container">
                <h2>signup</h2>
                <div>
                    <form action="" onSubmit={handleSubmit}>
                        <div>
                            <label htmlFor="name">Name: </label>
                            <input type="text"
                                id="name"
                                name="name"
                                value={formData.name}
                                onChange={handleInputChange}
                                placeholder="enter your name"

                            />
                        </div>

                        <div>
                            <label htmlFor="email">Email: </label>
                            <input type="email"
                                id="email"
                                name="email"
                                value={formData.email}
                                onChange={handleInputChange}
                                placeholder="enter you email"
                            />
                        </div>

                        <div>
                            <label htmlFor="password">Password: </label>
                            <input type="password"
                                id="password"
                                name="password"
                                value={formData.password}
                                onChange={handleInputChange}
                                placeholder="enter your password"
                            />
                        </div>
                        <button type="submit">signup</button>
                    </form>
                </div>
            </div>
        </>
    )
}