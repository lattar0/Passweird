import React from 'react';
import { createStackNavigator } from '@react-navigation/stack';

import { Passwords } from '../screens/Passwords';
import { Gallery } from '../screens/Gallery';
import { theme } from '../styles/theme';
import { Notes } from '../screens/Notes';

const { Screen, Navigator } = createStackNavigator();

export function AppRoutes() {
  return(
    <Navigator
      screenOptions={{
        headerShown: false,
        cardStyle: {
          backgroundColor: theme.colors.black
        }
      }}
    >     
      <Screen 
        name="Passwords"
        component={Passwords}
      />

      <Screen
        name="Gallery"
        component={Gallery}
      />

      <Screen
        name="Notes"
        component={Notes}
      /> 
    </Navigator>
  )
}