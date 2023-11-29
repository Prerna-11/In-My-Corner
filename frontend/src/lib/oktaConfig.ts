export const oktaConfig = {
    clientId: '0oab7chy20JK0Fpig5d7',
    issuer: 'https://dev-30187482.okta.com/oauth2/default',
    redirectUri: 'http://localhost:3000/login/callback',
    scopes: ['openid', 'profile', 'email'],
    pkce: true,
    disableHttpsCheck: true,
}